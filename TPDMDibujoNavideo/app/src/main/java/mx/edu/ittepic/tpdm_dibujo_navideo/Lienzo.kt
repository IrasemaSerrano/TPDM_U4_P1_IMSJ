package mx.edu.ittepic.tpdm_dibujo_navideo

import android.graphics.*
import android.provider.CalendarContract
import android.view.View

class Lienzo(p: MainActivity): View(p){

    var img = BitmapFactory.decodeResource(resources, R.drawable.luna)
    var luna = Bitmap.createScaledBitmap(img,100,100,false)

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()

        setBackgroundColor(Color.rgb(0, 0, 128))

        //Montañas
        p.color=Color.rgb(0, 255, 255)
        c.drawCircle(180f,860f, 600f, p)
        c.drawCircle(1200f, 950f, 750f, p)

        //arbol
        p.color=Color.rgb(0, 107, 71)
        c.drawCircle(150f, 350f, 60f, p)
        c.drawCircle(150f, 280f, 50f, p)
        c.drawCircle(150f, 210f, 40f, p)

        //tronco
        p.color=Color.rgb(150, 71, 0)
        c.drawRect(130f, 400f, 170f, 500f, p)

        //nube
        p.color=Color.rgb(130, 130, 130)
        c.drawCircle(680f, 130f, 65f, p)
        c.drawCircle(840f, 90f, 70f, p)
        c.drawCircle(750f, 80f, 65f, p)
        c.drawCircle(740f, 170f, 70f, p)
        c.drawCircle(830f, 160f, 65f, p)
        c.drawCircle(890f, 140f, 50f, p)


        //muñeco
        p.color=Color.WHITE
        c.drawCircle(1000f, 490f, 65f, p)
        c.drawCircle(1000f, 400f, 50f, p)

        //sombrero
        p.color=Color.rgb(150, 71, 0)
        c.drawRect(950f, 345f, 1050f, 368f, p)
        c.drawRect(970f, 280f, 1030f, 360f, p)

        //ojos
        p.color=Color.BLACK
        c.drawCircle(1015f, 390f, 5f, p)
        c.drawCircle(985f, 390f, 5f, p)

        //naris
        p.color=Color.rgb(255, 35, 1)
        c.drawLine(1000f, 400f, 1055f, 409f, p)
        c.drawLine(1000f, 409f, 1055f, 409f, p)

        //boca
        p.color=Color.BLACK
        c.drawLine(980f, 418f, 1005f, 425f, p)

        //botones
        p.color=Color.BLACK
        c.drawCircle(1000f, 460f, 10f, p)
        c.drawCircle(1000f, 490f, 10f, p)
        c.drawCircle(1000f, 520f, 10f, p)

        //tronco2
        p.color=Color.rgb(150, 71, 0)
        c.drawRect(1200f, 450f, 1250f, 500f, p)

        //arbol2
        p.color=Color.rgb(0, 143, 57)
        c.drawCircle(1200f, 410f, 60f, p)
        c.drawCircle(1250f, 410f, 60f, p)
        c.drawCircle(1180f, 380f, 60f, p)
        c.drawCircle(1270f, 380f, 60f, p)
        c.drawCircle(1190f, 350f, 60f, p)
        c.drawCircle(1260f, 350f, 60f, p)
        c.drawCircle(1230f, 330f, 60f, p)





        //c.drawCircle(0f, width-(height/2)+0f, width+0f, p)

        c.drawText("w:"+width+", h="+height, 50f, 50f, p)
        c.drawBitmap(luna, 300f, 100f, p)

    }

}