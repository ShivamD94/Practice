package pojo;

public class ResAddPlace
{
private String reference;

private String scope;

private String id;

private String place_id;

private String status;

public String getReference ()
{
return reference;
}

public void setReference (String reference)
{
this.reference = reference;
}

public String getScope ()
{
return scope;
}

public void setScope (String scope)
{
this.scope = scope;
}

public String getId ()
{
return id;
}

public void setId (String id)
{
this.id = id;
}

public String getPlace_id ()
{
return place_id;
}

public void setPlace_id (String place_id)
{
this.place_id = place_id;
}

public String getStatus ()
{
return status;
}

public void setStatus (String status)
{
this.status = status;
}

@Override
public String toString()
{
return "ClassPojo [reference = "+reference+", scope = "+scope+", id = "+id+", place_id = "+place_id+", status = "+status+"]";
}
}