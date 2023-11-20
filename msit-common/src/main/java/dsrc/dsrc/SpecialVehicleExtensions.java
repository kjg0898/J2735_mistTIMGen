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
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type SpecialVehicleExtensions from ASN1 Module DSRC.
 * @see Sequence
 */

public class SpecialVehicleExtensions extends Sequence {
    
    /**
     * The default constructor.
     */
    public SpecialVehicleExtensions()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SpecialVehicleExtensions(EmergencyDetails vehicleAlerts, 
		    EventDescription description, TrailerData trailers)
    {
	setVehicleAlerts(vehicleAlerts);
	setDescription(description);
	setTrailers(trailers);
    }
    
    public void initComponents()
    {
	mComponents[0] = new EmergencyDetails();
	mComponents[1] = new EventDescription();
	mComponents[2] = new TrailerData();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new EmergencyDetails();
	    case 1:
		return new EventDescription();
	    case 2:
		return new TrailerData();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "vehicleAlerts"
    public EmergencyDetails getVehicleAlerts()
    {
	return (EmergencyDetails)mComponents[0];
    }
    
    public void setVehicleAlerts(EmergencyDetails vehicleAlerts)
    {
	mComponents[0] = vehicleAlerts;
    }
    
    public boolean hasVehicleAlerts()
    {
	return componentIsPresent(0);
    }
    
    public void deleteVehicleAlerts()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "description"
    public EventDescription getDescription()
    {
	return (EventDescription)mComponents[1];
    }
    
    public void setDescription(EventDescription description)
    {
	mComponents[1] = description;
    }
    
    public boolean hasDescription()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDescription()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "trailers"
    public TrailerData getTrailers()
    {
	return (TrailerData)mComponents[2];
    }
    
    public void setTrailers(TrailerData trailers)
    {
	mComponents[2] = trailers;
    }
    
    public boolean hasTrailers()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTrailers()
    {
	setComponentAbsent(2);
    }
    
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "dsrc.dsrc",
	    "SpecialVehicleExtensions"
	),
	new QName (
	    "DSRC",
	    "SpecialVehicleExtensions"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"EmergencyDetails"
			    ),
			    new QName (
				"DSRC",
				"EmergencyDetails"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "EmergencyDetails"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "EmergencyDetails"
				)
			    ),
			    0
			)
		    ),
		    "vehicleAlerts",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"EventDescription"
			    ),
			    new QName (
				"DSRC",
				"EventDescription"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "EventDescription"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "EventDescription"
				)
			    ),
			    0
			)
		    ),
		    "description",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"TrailerData"
			    ),
			    new QName (
				"DSRC",
				"TrailerData"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "TrailerData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "TrailerData"
				)
			    ),
			    0
			)
		    ),
		    "trailers",
		    2,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SpecialVehicleExtensions object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SpecialVehicleExtensions object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SpecialVehicleExtensions
