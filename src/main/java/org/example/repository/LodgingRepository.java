package org.example.repository;

import org.example.model.Lodging;
import org.example.factory.util.CreateLodgings;

import java.util.List;

/**
 *
 * @author Manuel Aguilera / @aguileradev
*/public class LodgingRepository {

    private List<Lodging> lodgings;

    private LodgingRepository() {
        this.lodgings = CreateLodgings.initializeLodgingList();
    }

    private static class LodgingRepositoryHolder {
        public static final LodgingRepository INSTANCE = new LodgingRepository();
    }

    public static LodgingRepository getInstance(){
        return LodgingRepositoryHolder.INSTANCE;
    }

    public List<Lodging> getLodgings() {
        return lodgings;
    }
}
