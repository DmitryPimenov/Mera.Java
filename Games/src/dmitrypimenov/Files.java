package dmitrypimenov;

import java.io.*;

public class Files {
    private static final String sPath = "C:\\home\\tmp\\";

    public static void writeFile() {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(sPath + "save.txt");

            out.write(5);
            out.write(2);
            out.write(8);
            out.write(9);

            out.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readFile() {
        FileInputStream in = null;
        try {
            in = new FileInputStream(sPath + "result.txt");

            System.out.println(in.read());
            System.out.println(in.read());
            System.out.println(in.read());
            System.out.println(in.read());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeCharFile() {
        FileWriter out = null;
        try {
            out = new FileWriter(sPath + "result.txt");

            out.write("- Ghbdtn, ");
            out.write("  Vtldtl!");
            out.write("- Ghbdtn, ");
            out.write("  Vtldtl!");

            out.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readCharFile() {
        FileReader in = null;
        try {
            in = new FileReader(sPath + "result.txt");

            char[] data = new char[100];
            boolean hasData = true;
            String fileData = new String();
            do {
                int bytesRead = in.read(data, 0, 100);
                hasData = bytesRead > 0;
                fileData += new String(data);
                System.out.println("Read " + bytesRead + " bytes");
            } while (hasData);

            System.out.println("File contents:");
            System.out.println(fileData);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void checkAndCreateFile() {
        File file = new File(sPath + "test.file");
        if (!file.exists()) {
            System.out.println("File doesn't exist!");
            try {
                file.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists!");
        }
    }
}
