class Hybrid implements Electric, InternalCombustion {
    @Override
    public void chargeBattery() {
        System.out.println("Charging battery...");
    }

    @Override
    public void fillGas() {
        System.out.println("Refueling gas...");
    }
}