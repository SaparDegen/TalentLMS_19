public enum Days {
    MONDAY("Мен дуйшомбу куну Java программалоо тилин окуйм"),
    TUESDAY("Шейшембиде мен Java тили боюнча практикалык сабак алам"),
    WEDNESDAY("Шаршемби куну техникалык англис тилин окуйм"),
    THURSDAY("Бейшемби куну англис тилин уйроном"),
    FRIDAY("Жума куну мен жумшак жондомдор боюнча сабакка катышам"),
    SATURDAY("Ишемби куну мен Java боюнча уй тапшырмаларды аткарам"),
    SUNDAY("Жекшемби куну уй-булом менен эс алабыз");
    String planner;
    private Days(String planner) {
        this.planner = planner;
    }

    public String getPlanner() {
        return planner;
    }
}
