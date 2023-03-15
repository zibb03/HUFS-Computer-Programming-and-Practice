public class Member implements Comparable<Member>{
    // public String id;

    // //생성자
    // public Member(String id) {
    //     this.id = id;
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     if (obj instanceof Member) {
    //         Member member = (Member) obj;
    //         if (id.equals(member.id)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    //2022.12.01
    String name;
    Member(String name) {
        this.name = name;
    }
    
    @Override
    public int compareTo(Member o) {
        return name.compareTo(o.name);
    }
}
