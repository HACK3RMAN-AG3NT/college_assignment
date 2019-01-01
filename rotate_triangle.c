#include<graphics.h>
#include<time.h>
#include<math.h>
#include<stdio.h>

int main()
{
   int pi=3.1416;

   int i, gd = DETECT, gm;

   initgraph(&gd,&gm," ");

   int x_1=250,y_1=313,x_2=200,y_2=400,x_3=300,y_3=400;

   int X_1=x_1,X_2=x_2,X_3=x_3,Y_1=y_1,Y_2=y_2,Y_3=y_3;


   //calculating centroid
   int c_x,c_y;
   c_x = (x_1 + x_2 + x_3)/3;
   c_y = (y_1 + y_2 + y_3)/3;

   //shifting origin
   x_1 = x_1 - c_x;
   y_1 = c_y - y_1;
   x_2 = x_2 - c_x;
   y_2 = c_y - y_2;
   x_3 = x_3 - c_x;
   y_3 = c_y - y_3;


   for(i = 0 ; i <= 45 ; i++)
   {
      float value = pi/180.0;

      line(x_1+c_x,c_y-y_1,x_2+c_x,c_y-y_2);
   	  line(x_2+c_x,c_y-y_2,x_3+c_x,c_y-y_3);
      line(x_3+c_x,c_y-y_3,x_1+c_x,c_y-y_1);


      x_1 = floor((X_1-c_x)*cos(i*value) - (c_y-Y_1)*sin(i*value));
      y_1 = floor((c_y-Y_1)*cos(i*value) + (X_1-c_x)*sin(i*value));

      x_2 = floor((X_2-c_x)*cos(i*value) - (c_y-Y_2)*sin(i*value));
      y_2 = floor((c_y-Y_2)*cos(i*value) + (X_2-c_x)*sin(i*value));

      x_3 = floor((X_3-c_x)*cos(i*value) - (c_y-Y_3)*sin(i*value));
      y_3 = floor((c_y-Y_3)*cos(i*value) + (X_3-c_x)*sin(i*value));

      delay(50);

     cleardevice();
   }
   scanf("%d",&i);
   closegraph();

   return 0;
}
