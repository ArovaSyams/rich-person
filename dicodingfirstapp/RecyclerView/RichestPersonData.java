package androidapp.example.dicodingfirstapp.RecyclerView;

import java.util.ArrayList;

import androidapp.example.dicodingfirstapp.R;

public class RichestPersonData {

    public static String[] richestPersons = {
            "Jeff Bezzos",
            "Bill Gates",
            "Amancio Ortega",
            "Warrent Buffet",
            "Mark Zurkerberg",
            "Carlos Slim Helu",
            "Larry Ellison",
            "Michael Bloomberg",
            "Bernard Arnault",
            "Charles Koch",
    };

    public static String[] description = {
            "Pemilik Perusahaan Amazon",
            "Sebagai Ketua Microsoft",
            "Pendiri Busana Inditex",
            "Direktur Utama Berkshire Hathaway",
            "Pejabat Eksekutif Facebook",
            "CEO  Teléfonos de México dan América Móvil",
            "CEO database Oracle Corporation",
            "CEO Dari Bloomberg L.P",
            "ketua LVMH Moët Hennessy - Louis Vuitton SE",
            "CEO dari Koch Industries"
    };

    public static int[] personImage = {
            R.drawable.jeff_bezos,
            R.drawable.bill_gates,
            R.drawable.amancio_ortega,
            R.drawable.warrent_buffet,
            R.drawable.mark_zurbergker,
            R.drawable.carlos_slim_helu,
            R.drawable.larry_ellison,
            R.drawable.michael_bloomberg,
            R.drawable.bernard_arnault,
            R.drawable.charles_koch
    };

    public static ArrayList<RichestPerson> getListData() {
        ArrayList<RichestPerson> list = new ArrayList<>();
        for (int position = 0; position < richestPersons.length; position++) {
            RichestPerson richestPerson = new RichestPerson();
            richestPerson.setName(richestPersons[position]);
            richestPerson.setDescription(description[position]);
            richestPerson.setImage(personImage[position]);
            list.add(richestPerson);
        }
        return list;
    }
}
