package factory;

public class MessageFactory {

    public static Message createMessage(MsgEnum type){

        if(type == null)
            return null;

        if(type.equals(MsgEnum.FAX))
            return new Fax();

        else if(type.equals(MsgEnum.MAIL))
            return new Mail();

        // etc..
        return null;
    }
}
