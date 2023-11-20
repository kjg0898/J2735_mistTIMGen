/*************************************************************/
/* Copyright (C) 2023 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Neighbor System, Site-based, License 17353 17353,
 * at 16th Fl. IT Venture Tower (East), 135, Jungdae-ro, Songpa-Gu, Seoul 05717, Korea. */
/* Abstract syntax: j2735_cits_20201125 */
/* ASN.1 Java project: dsrc.Dsrc */
/* Created: Wed Jul 12 11:40:42 2023 */
/* ASN.1 Compiler for Java version: 7.2 */
/* ASN.1 compiler options and file names specified:
 * -output dsrc -nouniquepdu -per -uper -ber -der -cer -json -root
 * -pdusforopentypes -messageFormat msvc
 * D:/OSS_ASN1/Project/POLICE/J2735_CITS_20201125.asn
 * C:/Users/Administrator/AppData/Local/Temp/2/asn1studio.Administrator.9592/ossSamplePOLICE/J2735_CITS_20201125.asn
 */


package dsrc.dsrc;

import com.oss.asn1.AbstractData;
import com.oss.asn1.Choice;
import com.oss.asn1.INTEGER;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type VehicleID from ASN1 Module DSRC.
 * @see Choice
 */

public class VehicleID extends Choice {
    
    /**
     * The default constructor.
     */
    public VehicleID()
    {
    }
    
    public static final  int  entityID_chosen = 1;
    public static final  int  stationID_chosen = 2;
    
    // Methods for field "entityID"
    public static VehicleID createVehicleIDWithEntityID(TemporaryID entityID)
    {
	VehicleID __object = new VehicleID();

	__object.setEntityID(entityID);
	return __object;
    }
    
    public boolean hasEntityID()
    {
	return getChosenFlag() == entityID_chosen;
    }
    
    public TemporaryID getEntityID()
    {
	if (hasEntityID())
	    return (TemporaryID)mChosenValue;
	else
	    return null;
    }
    
    public void setEntityID(TemporaryID entityID)
    {
	setChosenValue(entityID);
	setChosenFlag(entityID_chosen);
    }
    
    
    // Methods for field "stationID"
    public static VehicleID createVehicleIDWithStationID(long stationID)
    {
	return createVehicleIDWithStationID(new StationID(stationID));
    }
    
    public static VehicleID createVehicleIDWithStationID(StationID stationID)
    {
	VehicleID __object = new VehicleID();

	__object.setStationID(stationID);
	return __object;
    }
    
    public boolean hasStationID()
    {
	return getChosenFlag() == stationID_chosen;
    }
    
    public StationID getStationID()
    {
	if (hasStationID())
	    return (StationID)mChosenValue;
	else
	    return null;
    }
    
    public void setStationID(long stationID)
    {
	setStationID(new StationID(stationID));
    }
    
    public void setStationID(StationID stationID)
    {
	setChosenValue(stationID);
	setChosenFlag(stationID_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case entityID_chosen:
		return new TemporaryID();
	    case stationID_chosen:
		return new StationID();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "dsrc.dsrc",
	    "VehicleID"
	),
	new QName (
	    "DSRC",
	    "VehicleID"
	),
	274450,
	null,
	new FieldsDict (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"TemporaryID"
			    ),
			    new QName (
				"DSRC",
				"TemporaryID"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(4)
				)
			    ),
			    new Bounds (
				Long.valueOf(4),
				Long.valueOf(4)
			    )
			)
		    ),
		    "entityID",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"StationID"
			    ),
			    new QName (
				"DSRC",
				"StationID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new StationID(0), 
				    new StationID(4294967295L),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(4294967295L)
			    ),
			    null
			)
		    ),
		    "stationID",
		    1,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' VehicleID object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' VehicleID object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for VehicleID
