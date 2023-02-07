package prueba;

/**
 * Clase para manejar las entradas de un blog
 * @version 2.4
 * @author Francisco Riquelme
 * @since 07/02/2023
 */

public class EntradaBlogfjrs {
		/**
		 * Separador es el caracter que separa ENTRADA DE del 
		 * nombre del autor
		 */
		public static char separador=':';
		private int id;
		private String texto;
		private String autor;
		
		/**
		 * 
		 * @param id Número identificador de la entrada
 		 * @param autor Nombre del creador de la entrada
		 * @param texto Texto que contendrá la entrada
		 * @throws IllegalArgumentException Si el id es negativo o igual a 0
		 */
		public EntradaBlogfjrs(int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		@Override
		/**
		 * toString de la clase.
		 * @return
		 */
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		/**
		 * Devuelve el numero de la entrada
		 * @return Número de la entrada
		 */
		
		public int getId(){
			return this.id;
		}
		/**
		 * Devuelve el texto completo de la entrada
		 * @return Texto completo de la entrada
		 */
		

		public String getTexto(){
			return this.texto;
		}
		/**
		 * Devuelve el nombre del autor de la entrada en mayúsculas
		 * @return Nombre del autor en mayúscula
		 */

		public String getAutor(){
			return this.autor.toUpperCase();
		}
		/**
		 * Devuelve el nombre del autor
		 * @return Nombre del autor.
		 * Ya no se usa. Mejor ver getAutor.
		 */
		

		public String devuelveAutor(){
			return this.autor;
		}
		
		/**
		 * No tiene porqué tener argumentos.
		 * @param args Introduce argumentos si es necesario.
		 */

		public static void main(String[] args) {

			EntradaBlogfjrs e1=new EntradaBlogfjrs (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
			System.out.println(e1);
		}
}
