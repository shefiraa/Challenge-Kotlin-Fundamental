import java.util.*

public var input = Scanner(System. `in`);

fun main() {
    println("===== Keterangan =====");
    print("Nama : ");
    var n: String? = input.nextLine();

    //Input Validation Nama Wajib Diisi
    if (n.isNullOrEmpty()) {
        println("Nama Wajib Diisi!")
        main()
    }

    print("Kelas : ");
    var k: String = input.nextLine();
    print("Nomor Absen : ");
    var na: String = input.nextLine();
    print("Massukan Username Instagram : ")

    //Elvis Operator
    val Username: String? = null
    val UsernameLength = Username?.length?: "Oops! Saya lupa mengisi program input Username Instagram"
    println(UsernameLength)
    println("=============================")
    menu()
}

//Menu Pilih Opsi
fun menu() {
    println("===== Menu =====");
    println("1. Kerucut\n2. Tabung\n5. Exit")
    print("Silakan Pilih Menu yang Tersedia : ")
    val pill: Int? = input.nextInt()
    when (pill) {
        1 -> Kerucut()
        2 -> Tabung()
        5 -> Exit()
        else -> {
            println("No Option")
            menu()
        }
    }
}

fun Kerucut() {
    println("===== Kerucut =====");
    print("Masukkan Tinggi Kerucut : ");
    val tinggi: Double = input.nextDouble();
    print("Masukkan Jari-Jari Kerucut : ");
    val jarijari: Double = input.nextDouble();

    //Hitung
    val volume: Double = Math.PI * (jarijari*jarijari) * tinggi / 3;
    println ("Volume Kerucut adalah $volume")

    //Pembulatan 2 Angka Di belakang Koma
    System.out.printf("%.2f",volume)
    println()

    //Back To Menu
    menu()
    println("=============================");
}

fun Tabung() {
    println("===== Tabung =====");
    print("Masukkan Tinggi Tabung : ");
    var tinggi: Double? = null
    tinggi = input.nextDouble();
    print("Masukkan Jari-Jari Tabung : ");
    var jarijari: Double? = null
    jarijari = input.nextDouble();

    val volume = Math.PI * jarijari * jarijari * tinggi
    println("Volume Tabung adalah $volume")

    //Pembulatan 2 Angka Di Belakang Koma
    System.out.printf("%.2f",volume)
    println()

    //Back To Menu
    menu()
}

fun Exit() {
    System.exit(0)
}