public class participantes{
   String nome;
   int GER;

   public participantes(String nome, int GER){
      this.nome = nome;
      this.GER = GER;
   }
   participantes e1 = new participantes("Brasil", 4);
   participantes e2 = new participantes("Espanha", 5);
   participantes e3 = new participantes("França", 5);
   participantes e4 = new participantes("Argentina", 4);
   participantes e5 = new participantes("Peru", 1);
   participantes e6 = new participantes("Alemanha", 4);
   participantes e7 = new participantes("Dra Any", 5);
   participantes e8 = new participantes("Dr Leandro", 5);
   participantes e9 = new participantes("Croácia", 3);
   participantes e10 = new participantes("Equador", 2);


  participantes[] listaparticipantes = {e1, e2, e3, e4, e5, e6, e7, e8, e9, e10};


 
   for(int i = 0; i<listaparticipantes.length; i++) {
   Equipe e = listaparticipantes[i];
   System.out.println(e.nome +" GER = " + e.GER);
  }

}
