public enum Days {
    MONDAY("��� �������� ���� Java ������������ ����� �����"),
    TUESDAY("���������� ��� Java ���� ������ ����������� ����� ����"),
    WEDNESDAY("�������� ���� ���������� ������ ����� �����"),
    THURSDAY("�������� ���� ������ ����� �������"),
    FRIDAY("���� ���� ��� ������ ��������� ������ ������� �������"),
    SATURDAY("������ ���� ��� Java ������ �� ������������� �������"),
    SUNDAY("�������� ���� ��-����� ����� �� ������");
    String planner;
    private Days(String planner) {
        this.planner = planner;
    }

    public String getPlanner() {
        return planner;
    }
}
