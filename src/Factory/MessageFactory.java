package Factory;

public class MessageFactory {

    public static Message createMessage(Enum<?> type){

        if(type == null)
            return null;

        if(type.equals(MSG.FAX))
            return new Fax();

        else if(type.equals(MSG.MAIL))
            return new Mail();

        // etc..
        return null;
    }
}
