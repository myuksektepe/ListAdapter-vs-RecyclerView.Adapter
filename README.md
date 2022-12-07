# ListAdapter-vs-RecyclerView.Adapter
Android ListAdapter vs RecyclerView.Adapter with Kotlin


<small>Türkçe;</small>

<p>ListAdapter aslında RecyclerView.Adapter’ün bir eklentisidir. Temel olarak her ikisinin de çalışma prensipleri aynıdır ve DiffUtil ile listeler arası farkları hesaplayabiliriz.</p>


<h2>Farkları</h2>

<b>•	Listeler arası fark hesaplamaları</b>
<br/>
<p>
- RecyclerView.Adapter’e iletilen iki liste arasındaki farkları DiffUtil ile hesaplamamız adaptörümüzü bu değişiklikler hakkında bilgilendirmemiz gerekir. Fakat bu işlem opsiyoneldir.
<br/><br/>
- ListAdapter ise bu işlemi DiffUtil’e bir nevi yardım eden AsyncListDiffer sınıfı sayesinde arka planda (background thread) otomatik olarak hesaplar. DiffUtill’i yapı (constructor) içinde belirtmek mecburidir.
<p/>



<br/><br/>
<b>•	Yeni liste gönderimi</b>
<p>
- Yeni listeyi RecyclerView.Adapter’e gönderirken ilgili fonksiyonu kendimiz yazmamız gerekir.
<br/><br/>
- Bu işlem için ListAdapter’ün “submitList” isimli kendine ait bir methodu vardır.
</p>


<br/><br/>
<b>•	Statik/dinamik içerikler</b>
<p>
- Eğer listeniz bir kere oluşacak ve değişmeyecekse yani statik bir liste ise RecyclerView.Adapter’ü DiffUtil’siz kullanmanız sizin için daha faydalı olacaktır.
<br/><br/>
- Fakat eğer WebSocket gibi sürekli akan bir veriyi ya da bir herhangi sebeple içeriği değişecek bir listeyi performanslı şekilde göstermek isterseniz en iyi seçenek ListAdapter olacaktır.
</p>



<br/><br/>
<b>•	UI değişimleri</b>
<p>
Ekran görüntülerinde görebileceğiniz gibi;

- DiffUtil kullanılmış RecylerView.Adapter ve ListAdapter’de ekranda ki değişimler animasyonlu gibi tatlı bir efekt ile gerçekleşirken;
<br/><br/>
- DiffUtil kullanılmamış RecylerView.Adapter’de liste sanki tamamen yeniden oluşuyor gibi bir görüntü söz konusudur.
</p>

