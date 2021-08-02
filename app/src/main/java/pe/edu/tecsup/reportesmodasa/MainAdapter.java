package pe.edu.tecsup.reportesmodasa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private  String[] opciones;
    private  int[] imagenes;
    private  int[] colores;

    public MainAdapter(Context c, String[] opciones, int[] imagenes, int[] colores) {
        context = c;
        this.opciones = opciones;
        this.imagenes = imagenes;
        this.colores = colores;
    }


    @Override
    public int getCount() {
        return opciones.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(layoutInflater == null){
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView == null){
            convertView = layoutInflater.inflate(R.layout.grid_item,null);
        }
        ImageView imageView= convertView.findViewById(R.id.gridImage);
        TextView textView  = convertView.findViewById(R.id.gridInfo);

        imageView.setImageResource(imagenes[position]);
        textView.setText(opciones[position]);
        textView.setBackgroundResource(colores[position]);
        return convertView;
    }
}
