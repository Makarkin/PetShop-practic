package petshop.enumholder;

import petshop.cleanpollution.CleanJob;
import petshop.cleanpollution.PolutionJob;
import petshop.fileswork.WorkDataClass;
import petshop.search.SearchClass;
import petshop.sellbuyprint.PrintClass;
import petshop.sellbuyprint.SellBuyClass;
import petshop.simulation.SimulationProcess;
import petshop.storage.StorageClass;
import static petshop.holder.HolderClass.getWorkdata;

public enum HolderClass {

    HOLDERSTORAGE {
        private StorageClass holderStorage;

        public StorageClass getHolderStorage() {
            if (holderStorage == null) {
                getWorkdata().readValue();
                return holderStorage;
            } else {
                return holderStorage;
            }
        }

        public void setHolderStorage(StorageClass holderStorage) {
            if (this.holderStorage == null) {
                this.holderStorage = holderStorage;
            }
        }
    },

    SELLBUY {
        private SellBuyClass sellBuy;

        public SellBuyClass getSellBuy() {
            if (this.sellBuy == null) {
                this.sellBuy = new SellBuyClass();
                return this.sellBuy;
            } else {
                return this.sellBuy;
            }
        }
    },

    SEARCHING {
        private SearchClass searching;

        public SearchClass getSearching() {
            if (searching == null) {
                searching = new SearchClass();
                return searching;
            } else {
                return searching;
            }
        }
    },

    SIMULATION {
        private SimulationProcess simulation;

        public SimulationProcess getSimulation() {
            if (simulation == null) {
                simulation = new SimulationProcess();
                return simulation;
            } else {
                return simulation;
            }
        }
    },

    DATASAVING {
        private WorkDataClass dataSaving;

        public WorkDataClass getDataSaving() {
            if (dataSaving == null) {
                dataSaving = new WorkDataClass();
                return dataSaving;
            } else {
                return dataSaving;
            }
        }
    },

    PRINTING {
        private PrintClass printing;

        public PrintClass getPrinting() {
            if (printing == null) {
                printing = new PrintClass();
                return printing;
            } else {
                return printing;
            }
        }
    },

    CLEANING {
        private CleanJob cleaning;

        public CleanJob getCleaning() {
            if (cleaning == null) {
                cleaning = new CleanJob();
                return cleaning;
            } else {
                return cleaning;
            }
        }
    },

    POLLUTION {
        private PolutionJob pollution;

        public PolutionJob getPollution() {
            if (pollution == null) {
                pollution = new PolutionJob();
                return pollution;
            } else {
                return pollution;
            }
        }
    },

    WORKDATA {
        private WorkDataClass workdata;

        public WorkDataClass getWorkdata() {
            if (workdata == null) {
                workdata = new WorkDataClass();
                return workdata;
            } else {
                return workdata;
            }
        }
    }
}
