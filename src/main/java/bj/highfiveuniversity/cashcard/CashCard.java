package bj.highfiveuniversity.cashcard;
import java.util.Objects;

public class CashCard {
   private Long id;
   private Double amount;
    

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }


    public CashCard(Long id, Double amount) {
        this.id = id;
        this.amount = amount;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CashCard)) {
            return false;
        }
        CashCard cashCard = (CashCard) o;
        return Objects.equals(id, cashCard.id) && Objects.equals(amount, cashCard.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount);
    }
    
    

}