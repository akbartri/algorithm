package basic.annotations;

public class AnnotationTheory {
//    @SuppressWarnings("unused") untuk meniadakan warning jika ada variabel yang tidak dipakai
//    contoh

    @SuppressWarnings("unused")
    int angka = 0; //jika tidak diberi @SuppressWarnings("unused"), maka akan muncul warning, var angka is never used

//    lihat class ImportantString, contoh untuk custom annotation

//    @Deprecated = tell coder to not using this var / method
//    @Override = tell to compiler that the method u point at was override from parent class
//    @SuppressWarnings() for removing the warning, if the var / method isnt use but already declared
//    @FunctionalInterface to tell the compiler, this interface only able to have 1 abstract method
}
