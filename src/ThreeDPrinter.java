public class ThreeDPrinter implements SwBuilders {
    @Override
    public House createHouse() {
        return new ThreeDHouse();
    }

    @Override
    public Store createStore() {
        return new ThreeDStore();
    }
}
