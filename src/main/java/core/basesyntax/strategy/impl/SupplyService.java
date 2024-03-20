package core.basesyntax.strategy.impl;

import core.basesyntax.model.FruitsTransaction;
import core.basesyntax.service.StorageService;
import core.basesyntax.service.impl.StorageServiceImpl;
import core.basesyntax.strategy.service.OperationHandler;

public class SupplyService implements OperationHandler {
    private final StorageService storageService = new StorageServiceImpl();

    @Override
    public void perform(FruitsTransaction fruitsTransaction) {
        storageService.updateQuantity(fruitsTransaction.getName(),
                storageService.getQuantity(fruitsTransaction.getName())
                        + fruitsTransaction.getQuantity());
    }
}
