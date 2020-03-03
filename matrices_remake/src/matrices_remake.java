
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonatan
 */
public class matrices_remake {
    static Scanner leer=new Scanner(System.in);
    public static void imprimirMatriz(int[][] M){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
               if(j==0 && i!=0){System.out.println("");}
                System.out.print("\t"+M[i][j]+"|");
            }
        }
        System.out.println("");
    }
     public static int[][] transformada01(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {                
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + i;               
            }
        }        
        return M;
    }
     public static int[][] transformada02(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {                
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + j;               
            }
        }        
        return M;
    }
     public static int[][] transformada03(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {                
                if((i+j)%2==0){
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + j;      
                }else{
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + i;      
                }
            }
        }        
        return M;
        }
     public static int[][] transformada04(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {                
                if((i+j)%2==0){
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + i;      
                }else{
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + j;      
                }
            }
        }        
        return M;
        }
     
    
      public static int[][] transformada05(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int i = 0; i <dim; i++) {
            for (int j = dim-1; j >= dim-1-i; j--) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        }
      public static int[][] transformada06(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j <= i; j++) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        }
      public static int[][] transformada07(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j <=dim-1-i; j++) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        }
      public static int[][] transformada08(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = i; j <dim; j++) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        }
      public static int[][] transformada09(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int i = 0; i <dim; i++) {
            for (int j = dim-i-1; j<dim; j++) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        }
      public static int[][] transformada10(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = i; j >= 0; j--) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        }
      public static int[][] transformada11(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = dim-i-1; j>=0; j--) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        }
       public static int[][] transformada12(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int i = 0; i <dim; i++) {
            for (int j = dim-1; j >= i; j--) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        }
       public static int[][] transformada13(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int j = 0; j <dim; j++) {
            for (int i = 0; i<dim-j; i++) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        }
         public static int[][] transformada14(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int j = 0; j <dim; j++) {
            for (int i = 0; i<=j; i++) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        }
         public static int[][] transformada15(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int j = 0; j<dim; j++) {
            for (int i = dim-1; i>=j; i--) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        }
         public static int[][] transformada16(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int j=0; j<dim; j++) {
            for (int i=dim-1; i>dim-j-2; i--) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        }
          public static int[][] transformada17(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int j=dim-1;j>=0; j--) {
            for (int i = 0; i<=0+j; i++) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        }
          public static int[][] transformada18(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int j=dim; j>=0; j--) {
            for (int i = 0; i<dim-j; i++) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        }
          public static int[][] transformada19(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int j=dim-1;j>=0; j--) {
            for (int i = dim-1; i>=dim-j-1; i--) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        }
          public static int[][] transformada20(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();
        for (int j=dim-1; j>=0; j--) {
            for (int i=dim-1; i>=j; i--) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        }
          public static int[][] transformada21(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();//dim=5 numInit=0
        for(int j = 0; j<dim; j++){
            if(j%2==0){
            for (int i=0; i<dim; i++) { //              
                M[i][j]=numInit;
                numInit++; }            
            }else{
            for (int i=dim-1; i>=0; i--) {                
                M[i][j]=numInit;
                numInit++;}            
            }
        }
        return M;
        }
          public static int[][] transformada22(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();//dim=5 numInit=0
        for(int j = 0; j<dim; j++){
            if(j%2==0){
            for (int i = dim-1; i >=0; i--) { //              
                M[i][j]=numInit;
                numInit++; }            
            }else{
            for (int i = 0; i <dim; i++) {                
                M[i][j]=numInit;
                numInit++;}            
            }
        }
        return M;
        }
        
          public static int[][] transformada23(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();//dim=5 numInit=0
        for(int j=dim-1;j>=0; j--){
            if(j%2==0){
            for (int i=0; i<dim; i++) { //              
                M[i][j]=numInit;
                numInit++; }            
            }else{
            for (int i=dim-1; i>=0; i--) {                
                M[i][j]=numInit;
                numInit++;}            
            }
        }
        return M;
        }
          public static int[][] transformada24(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();//dim=5 numInit=0
        for(int j=dim-1;j>=0; j--){
            if(j%2==0){
            for (int i=dim-1; i>=0; i--) { //              
                M[i][j]=numInit;
                numInit++; }            
            }else{
            for (int i=0; i<dim; i++) {                
                M[i][j]=numInit;
                numInit++;}            
            }
        }
        return M;
        }
          public static int[][] transformada25(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();//dim=5 numInit=0
        for(int i=0; i<dim; i++){
            if(i%2==0){
            for (int j=0; j<dim; j++) { //              
                M[i][j]=numInit;
                numInit++; }            
            }else{
            for (int j=dim-1; j>=0; j--) {                
                M[i][j]=numInit;
                numInit++;}            
            }
        }
        return M;
        }
           public static int[][] transformada26(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();//dim=5 numInit=0
        for(int i=0; i<dim; i++){
            if(i%2==0){
            for (int j=dim-1; j>=0; j--) { //              
                M[i][j]=numInit;
                numInit++; }            
            }else{
            for (int j=0; j<dim; j++) {                
                M[i][j]=numInit;
                numInit++;}            
            }
        }
        return M;
        }
           public static int[][] transformada27(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();//dim=5 numInit=0
        for(int i=dim-1;i>=0;i--){
            if(i%2==0){
            for (int j=dim-1; j>=0; j--) { //              
                M[i][j]=numInit;
                numInit++; }            
            }else{
            for (int j=0; j<dim; j++) {                
                M[i][j]=numInit;
                numInit++;}            
            }
        }
        return M;
        }
           public static int[][] transformada28(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=leer.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=leer.nextInt();//dim=5 numInit=0
        for(int i=dim-1;i>=0;i--){
            if(i%2!=0){
            for (int j=dim-1; j>=0; j--) { //              
                M[i][j]=numInit;
                numInit++; }            
            }else{
            for (int j=0; j<dim; j++) {                
                M[i][j]=numInit;
                numInit++;}            
            }
        }
        return M;
        }
        public static int[][] transformada29(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=leer.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=leer.nextInt();//dim=5 numInit=0
    int inicio=0;
    int lim=dim-1;
    int cont=numInit;
        for(int j=0;j<(dim);j++){
        for(int i=inicio;i<=lim;i++){
            M[inicio][i]=cont++;
        }
        for(int i=inicio+1;i<=lim;i++){
            M[i][lim]=cont++;
        }
        for(int i=lim-1;i>=inicio;i--){
            M[lim][i]=cont++;
        }
        for(int i=lim-1;i>=inicio+1;i--){
            M[i][inicio]=cont++;
        }
        inicio++;
        lim--;
        }
        
        return M;
    }
         public static int[][] transformada30(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=leer.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=leer.nextInt();//dim=5 numInit=0
    int inicio=0;
    int lim=dim-1;
    int cont=numInit;
        for(int j=0;j<(dim);j++){
        for(int i=inicio;i<=lim;i++){
            M[i][lim]=cont++;
        }
        for(int i=lim-1;i>=inicio;i--){
            M[lim][i]=cont++;
        }
        for(int i=lim-1;i>=inicio;i--){
            M[i][inicio]=cont++;
        }
        for(int i=inicio+1;i<=lim-1;i++){
            M[inicio][i]=cont++;
        }
        inicio++;
        lim--;
        }
        
        return M;
    }
          public static int[][] transformada31(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=leer.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=leer.nextInt();//dim=5 numInit=0
    int inicio=0;
    int lim=dim-1;
    int cont=numInit;
        for(int j=0;j<(dim);j++){
        for(int i=lim;i>=inicio;i--){
            M[lim][i]=cont++;
        }
        for(int i=lim-1;i>=inicio;i--){
            M[i][inicio]=cont++;
        }
        for(int i=inicio+1;i<=lim;i++){
            M[inicio][i]=cont++;
        }
        for(int i=inicio+1;i<=lim-1;i++){
            M[i][lim]=cont++;
        }
        inicio++;
        lim--;
        }
        
        return M;
    }
           public static int[][] transformada32(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=leer.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=leer.nextInt();//dim=5 numInit=0
    int inicio=0;
    int lim=dim-1;
    int cont=numInit;
        for(int j=0;j<(dim);j++){
        for(int i=lim;i>=inicio;i--){
            M[i][inicio]=cont++;
        }
        for(int i=inicio+1;i<=lim;i++){
            M[inicio][i]=cont++;
        }
        for(int i=inicio+1;i<=lim;i++){
            M[i][lim]=cont++;
        }
        for(int i=lim-1;i>=inicio+1;i--){
            M[lim][i]=cont++;
        }
        inicio++;
        lim--;
        }
        
        return M;
    }
           public static int[][] transformada33(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=leer.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=leer.nextInt();//dim=5 numInit=0
    int inicio=0;
    int lim=dim-1;
    int cont=numInit;
        for(int j=0;j<(dim);j++){
        for(int i=lim;i>=inicio;i--){
            M[inicio][i]=cont++;
        }
        for(int i=inicio+1;i<=lim;i++){
            M[i][inicio]=cont++;
        }
        for(int i=inicio+1;i<=lim;i++){
            M[lim][i]=cont++;
        }
        for(int i=lim-1;i>=inicio+1;i--){
            M[i][lim]=cont++;
        }
        inicio++;
        lim--;
        }
        
        return M;
    }
           public static int[][] transformada34(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=leer.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=leer.nextInt();//dim=5 numInit=0
    int inicio=0;
    int lim=dim-1;
    int cont=numInit;
        for(int j=0;j<(dim);j++){
        for(int i=inicio;i<=lim;i++){
            M[i][inicio]=cont++;
        }
        for(int i=inicio+1;i<=lim;i++){
            M[lim][i]=cont++;
        }
        for(int i=lim-1;i>=inicio;i--){
            M[i][lim]=cont++;
        }
        for(int i=lim-1;i>=inicio+1;i--){
            M[inicio][i]=cont++;
        }
        inicio++;
        lim--;
        }
        
        return M;
    }
           public static int[][] transformada35(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=leer.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=leer.nextInt();//dim=5 numInit=0
    int inicio=0;
    int lim=dim-1;
    int cont=numInit;
        for(int j=0;j<(dim);j++){
        for(int i=inicio;i<=lim;i++){
            M[lim][i]=cont++;
        }
        for(int i=lim-1;i>=inicio;i--){
            M[i][lim]=cont++;
        }
        for(int i=lim-1;i>=inicio;i--){
            M[inicio][i]=cont++;
        }
        for(int i=inicio+1;i<=lim-1;i++){
            M[i][inicio]=cont++;
        }
        inicio++;
        lim--;
        }
        
        return M;
    }
           public static int[][] transformada36(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=leer.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=leer.nextInt();//dim=5 numInit=0
    int inicio=0;
    int lim=dim-1;
    int cont=numInit;
        for(int j=0;j<(dim);j++){
        for(int i=lim;i>=inicio;i--){
            M[i][lim]=cont++;
        }
        for(int i=lim-1;i>=inicio;i--){
            M[inicio][i]=cont++;
        }
        for(int i=inicio+1;i<=lim;i++){
            M[i][inicio]=cont++;
        }
        for(int i=inicio+1;i<=lim-1;i++){
            M[lim][i]=cont++;
        }
        inicio++;
        lim--;
        }
        
        return M;
    }
        
      public static void main(String[] args) {
        imprimirMatriz(transformada01());
        //imprimirMatriz(transformada02());
        //imprimirMatriz(transformada03());
        //imprimirMatriz(transformada04());
        //imprimirMatriz(transformada05());
        //imprimirMatriz(transformada06());
        //imprimirMatriz(transformada07());
        //imprimirMatriz(transformada08());
        //imprimirMatriz(transformada09());
        //imprimirMatriz(transformada10());
        //imprimirMatriz(transformada11());
        //imprimirMatriz(transformada12());
        //imprimirMatriz(transformada13());
        //imprimirMatriz(transformada14());
        //imprimirMatriz(transformada15());
        //imprimirMatriz(transformada16());
        //imprimirMatriz(transformada17());
        //imprimirMatriz(transformada18());
        //imprimirMatriz(transformada19());
        //imprimirMatriz(transformada20());
        //imprimirMatriz(transformada21());
        //imprimirMatriz(transformada22());
        //imprimirMatriz(transformada23());
        //imprimirMatriz(transformada24());
        //imprimirMatriz(transformada25());
        //imprimirMatriz(transformada26());
        //imprimirMatriz(transformada27());
        //imprimirMatriz(transformada28());
        //imprimirMatriz(transformada29());
        //imprimirMatriz(transformada30());
        //imprimirMatriz(transformada31());
        //imprimirMatriz(transformada32());
        //imprimirMatriz(transformada33());
        //imprimirMatriz(transformada34());
        //imprimirMatriz(transformada35());
        //imprimirMatriz(transformada36());
      }
    
}
