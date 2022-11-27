package model.iso;

public class WindowsIso implements Iso {

    @Override
    public void instalarIso() {
        System.out.println("set_colors 6 7 2 1 3\n" +
                "            read -rd '' ascii_data <<'EOF'\n" +
                "${c3}                            .oodMMMM\n" +
                "                   .oodMMMMMMMMMMMMM\n" +
                "${c4}       ..oodMMM${c3}  MMMMMMMMMMMMMMMMMMM\n" +
                "${c4} oodMMMMMMMMMMM${c3}  MMMMMMMMMMMMMMMMMMM\n" +
                "${c4} MMMMMMMMMMMMMM${c3}  MMMMMMMMMMMMMMMMMMM\n" +
                "${c4} MMMMMMMMMMMMMM${c3}  MMMMMMMMMMMMMMMMMMM\n" +
                "${c4} MMMMMMMMMMMMMM${c3}  MMMMMMMMMMMMMMMMMMM\n" +
                "${c4} MMMMMMMMMMMMMM${c3}  MMMMMMMMMMMMMMMMMMM\n" +
                "${c4} MMMMMMMMMMMMMM${c3}  MMMMMMMMMMMMMMMMMMM\n" +
                "\t\t\t\t\t    \n" +
                "${c1} MMMMMMMMMMMMMM${c5}  MMMMMMMMMMMMMMMMMMM\n" +
                "${c1} MMMMMMMMMMMMMM${c5}  MMMMMMMMMMMMMMMMMMM\n" +
                "${c1} MMMMMMMMMMMMMM${c5}  MMMMMMMMMMMMMMMMMMM\n" +
                "${c1} MMMMMMMMMMMMMM${c5}  MMMMMMMMMMMMMMMMMMM\n" +
                "${c1} MMMMMMMMMMMMMM${c5}  MMMMMMMMMMMMMMMMMMM\n" +
                "${c1} `^^^^^^MMMMMMM${c5}  MMMMMMMMMMMMMMMMMMM\n" +
                "${c1}       ````^^^^${c5}  ^^MMMMMMMMMMMMMMMMM\n" +
                "                      ````^^^^^^MMMM\n" +
                "EOF");
    }
}
