package DDitJavaClass;

public class Study220607 {
    public static void main(String[] args) {
        String[] classGruop = {"임창균", "염호준", "심재린","최장훈"};
        System.out.println("별명이 염오줌인 " + classGruop[1]);
        System.out.println("이클립스를 고장낸 " + classGruop[2]);
        System.out.println("DDIT " + classGruop[3]);
        System.out.println("문제가 많은 " + classGruop[0]);
        String[] classGroup = new String[4];
        classGroup[0] = "임창균";
        System.out.println(classGroup.length);
        classGroup[1] = "염호준";
        System.out.println(classGroup.length);
        classGroup[2] = "심재린";
        System.out.println(classGroup.length);
        classGroup[3] = "최장훈";
        System.out.println(classGroup.length);
        System.out.println(classGroup[1]+ " look like a SCV");


    }

}
