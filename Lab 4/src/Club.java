class Club {
    static String clubName = "Tech Club";
    String memberName;

    // Constructor
    public Club(String memberName) {
        this.memberName = memberName;
    }

    // Static method to display club name
    static void displayClubName() {
        System.out.println("Club Name: " + clubName);
    }

    // Display member details
    void displayMember() {
        System.out.println("Member: " + memberName + " | Club: " + clubName);
    }

    public static void main(String[] args) {
        Club.displayClubName();

        Club member1 = new Club("Vedant");
        Club member2 = new Club("Mayank");

        member1.displayMember();
        member2.displayMember();
    }
}
