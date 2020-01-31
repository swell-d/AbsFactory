public class Worker implements SwBuilders {
    @Override
    public House createHouse() {
        return new HouseFromWorker();
    }

    @Override
    public Store createStore() {
        return new StoreFromWorker();
    }
}
