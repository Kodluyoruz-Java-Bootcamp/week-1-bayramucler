package h1_s8;

public class CollectionFramework_Examples {

    //Collection Framework'un önemli yapıları

    /*
      List interface;
        1-ArayList
        2-LinkedList
        3-Vector
        4-Stack

       Set interface;
       1-HashSet
       2-LinkedHashSet
       3-TreeSet

       Map interface;
       (Key-value yapısı vardır. Key'ler benzersiz olmalı fakat değerler tekrarlayabilir.)
       1-HashTable
       2-HashMap
       3-TreeMap
     */

     /*
        Class           Interface               Tekrarlar       Null saklar     Ekleme sıralıdır       Sıralıdır        Indexten erişim var
        ArrayList       List                         X                X                X                  -                   X
        LinkedList      List, Queue, Dequeue         X                X                X                  -                   X
        HashSet         Set                          -                X                -                  -                   -
        LinkedHashSet   Set                          -                X                X                  -                   -
        TreeSet         SortedSet                    -                -                -                  X                   -
      */


    /*
    Önemli Metotlar

    List Interface
    Metod                                   Açıklama
    add()                                   Listeye eleman ekler.
    size()                                  Listenin boyutunu döner.
    get(int index)                          Verilen index'teki elemanı döner.
    set(int index,E element)                Verilen index'teki elemanı değiştirir.
    indexOf(element)                        Verilen elemanın indexini döner.
     */


    /*
    Set Interface
    Metod                                   Açıklama
    add()                                   Set'te olmayan bir elemansa listeye ekler.
    clear()                                 Tüm elemanları set'ten kaldırır.
    toArray()                               Set'teki tüm elemanları içeren bir array döner.
     */

     /*
    Map Interface
    Metod                                   Açıklama
    put(Object key, Object value)           Verilen anahtarı verilen nesneye işler
    isEmpty()                               Anahtar değer eşleşmesine göre true\false döner.
    get(Object key)                         Verilen anahtarın değerini döner.
    remove(Object key)                      Verilen anahtarı map'ten kaldırır.
     */

}
