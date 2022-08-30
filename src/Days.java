public enum Days {
    MONDAY("Men duishombu kunu Java programmaloo tilin okuim"),
    TUESDAY("Sheishembi kunu men Java tili boyuncha praktikalyk sabak alam"),
    WEDNESDAY("Sharshembi kunu technicalyk Anglis tilin okuym"),
    THURSDAY("Beishembi kunu Anglis tilin uyronom"),
    FRIDAY("Zhuma kunu men zhumshak zhondomdor boyuncha sabakka katysham"),
    SATURDAY("Ishembi kunu men Java boyuncha uy tapshirmalardy atkaram"),
    SUNDAY("Zhekshembi kunu uy-bulom menen es alabyz");
    String planner;
    private Days(String planner) {
        this.planner = planner;
    }

    public String getPlanner() {
        return planner;
    }
}
