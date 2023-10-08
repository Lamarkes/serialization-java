import java.io.Serializable;

public class Produto implements Serializable {


        // transiente signifa que o atributo nao sera serializado
        private transient String name;
        private Double price;

        public Produto(){}

        public Produto(String name, Double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Produto{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
}
