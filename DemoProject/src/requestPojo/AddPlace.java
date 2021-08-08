package requestPojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class AddPlace
{
    private String[] types;

    private String website;

    private String address;

    private String name;

    private String accuracy;

    private Location location;

    private String phone_number;

    private String language;

    public String[] getTypes ()
    {
        return types;
    }

    public void setTypes (String[] types)
    {
        this.types = types;
    }

    public String getWebsite ()
    {
        return website;
    }

    public void setWebsite (String website)
    {
        this.website = website;
    }

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getAccuracy ()
    {
        return accuracy;
    }

    public void setAccuracy (String accuracy)
    {
        this.accuracy = accuracy;
    }

    public Location getLocation ()
    {
        return location;
    }

    public void setLocation (Location location)
    {
        this.location = location;
    }

    public String getPhone_number ()
    {
        return phone_number;
    }

    public void setPhone_number (String phone_number)
    {
        this.phone_number = phone_number;
    }

    public String getLanguage ()
    {
        return language;
    }

    public void setLanguage (String language)
    {
        this.language = language;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [types = "+types+", website = "+website+", address = "+address+", name = "+name+", accuracy = "+accuracy+", location = "+location+", phone_number = "+phone_number+", language = "+language+"]";
    }
}