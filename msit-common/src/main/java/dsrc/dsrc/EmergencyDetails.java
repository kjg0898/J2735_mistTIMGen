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
 * Define the ASN1 Type EmergencyDetails from ASN1 Module DSRC.
 * @see Sequence
 */

public class EmergencyDetails extends Sequence {
    
    /**
     * The default constructor.
     */
    public EmergencyDetails()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public EmergencyDetails(SSPindex sspRights, SirenInUse sirenUse, 
		    LightbarInUse lightsUse, MultiVehicleResponse multi, 
		    PrivilegedEvents events, ResponseType responseType)
    {
	setSspRights(sspRights);
	setSirenUse(sirenUse);
	setLightsUse(lightsUse);
	setMulti(multi);
	setEvents(events);
	setResponseType(responseType);
    }
    
    /**
     * Construct with required components.
     */
    public EmergencyDetails(SSPindex sspRights, SirenInUse sirenUse, 
		    LightbarInUse lightsUse, MultiVehicleResponse multi)
    {
	setSspRights(sspRights);
	setSirenUse(sirenUse);
	setLightsUse(lightsUse);
	setMulti(multi);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SSPindex();
	mComponents[1] = SirenInUse.unavailable;
	mComponents[2] = LightbarInUse.unavailable;
	mComponents[3] = MultiVehicleResponse.unavailable;
	mComponents[4] = new PrivilegedEvents();
	mComponents[5] = ResponseType.notInUseOrNotEquipped;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new SSPindex();
	    case 1:
		return SirenInUse.unavailable;
	    case 2:
		return LightbarInUse.unavailable;
	    case 3:
		return MultiVehicleResponse.unavailable;
	    case 4:
		return new PrivilegedEvents();
	    case 5:
		return ResponseType.notInUseOrNotEquipped;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sspRights"
    public SSPindex getSspRights()
    {
	return (SSPindex)mComponents[0];
    }
    
    public void setSspRights(SSPindex sspRights)
    {
	mComponents[0] = sspRights;
    }
    
    
    // Methods for field "sirenUse"
    public SirenInUse getSirenUse()
    {
	return (SirenInUse)mComponents[1];
    }
    
    public void setSirenUse(SirenInUse sirenUse)
    {
	mComponents[1] = sirenUse;
    }
    
    
    // Methods for field "lightsUse"
    public LightbarInUse getLightsUse()
    {
	return (LightbarInUse)mComponents[2];
    }
    
    public void setLightsUse(LightbarInUse lightsUse)
    {
	mComponents[2] = lightsUse;
    }
    
    
    // Methods for field "multi"
    public MultiVehicleResponse getMulti()
    {
	return (MultiVehicleResponse)mComponents[3];
    }
    
    public void setMulti(MultiVehicleResponse multi)
    {
	mComponents[3] = multi;
    }
    
    
    // Methods for field "events"
    public PrivilegedEvents getEvents()
    {
	return (PrivilegedEvents)mComponents[4];
    }
    
    public void setEvents(PrivilegedEvents events)
    {
	mComponents[4] = events;
    }
    
    public boolean hasEvents()
    {
	return componentIsPresent(4);
    }
    
    public void deleteEvents()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "responseType"
    public ResponseType getResponseType()
    {
	return (ResponseType)mComponents[5];
    }
    
    public void setResponseType(ResponseType responseType)
    {
	mComponents[5] = responseType;
    }
    
    public boolean hasResponseType()
    {
	return componentIsPresent(5);
    }
    
    public void deleteResponseType()
    {
	setComponentAbsent(5);
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
	    "EmergencyDetails"
	),
	new QName (
	    "DSRC",
	    "EmergencyDetails"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"SSPindex"
			    ),
			    new QName (
				"DSRC",
				"SSPindex"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SSPindex(0), 
				    new SSPindex(31),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(31)
			    ),
			    null
			)
		    ),
		    "sspRights",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"SirenInUse"
			    ),
			    new QName (
				"DSRC",
				"SirenInUse"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"notInUse",
					1
				    ),
				    new MemberListElement (
					"inUse",
					2
				    ),
				    new MemberListElement (
					"reserved",
					3
				    )
				}
			    ),
			    0,
			    SirenInUse.unavailable
			)
		    ),
		    "sirenUse",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"LightbarInUse"
			    ),
			    new QName (
				"DSRC",
				"LightbarInUse"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"notInUse",
					1
				    ),
				    new MemberListElement (
					"inUse",
					2
				    ),
				    new MemberListElement (
					"yellowCautionLights",
					3
				    ),
				    new MemberListElement (
					"schooldBusLights",
					4
				    ),
				    new MemberListElement (
					"arrowSignsActive",
					5
				    ),
				    new MemberListElement (
					"slowMovingVehicle",
					6
				    ),
				    new MemberListElement (
					"freqStops",
					7
				    )
				}
			    ),
			    0,
			    LightbarInUse.unavailable
			)
		    ),
		    "lightsUse",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"MultiVehicleResponse"
			    ),
			    new QName (
				"DSRC",
				"MultiVehicleResponse"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"singleVehicle",
					1
				    ),
				    new MemberListElement (
					"multiVehicle",
					2
				    ),
				    new MemberListElement (
					"reserved",
					3
				    )
				}
			    ),
			    0,
			    MultiVehicleResponse.unavailable
			)
		    ),
		    "multi",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"PrivilegedEvents"
			    ),
			    new QName (
				"DSRC",
				"PrivilegedEvents"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "PrivilegedEvents"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "PrivilegedEvents"
				)
			    ),
			    0
			)
		    ),
		    "events",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"ResponseType"
			    ),
			    new QName (
				"DSRC",
				"ResponseType"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"notInUseOrNotEquipped",
					0
				    ),
				    new MemberListElement (
					"emergency",
					1
				    ),
				    new MemberListElement (
					"nonEmergency",
					2
				    ),
				    new MemberListElement (
					"pursuit",
					3
				    ),
				    new MemberListElement (
					"stationary",
					4
				    ),
				    new MemberListElement (
					"slowMoving",
					5
				    ),
				    new MemberListElement (
					"stopAndGoMovement",
					6
				    )
				}
			    ),
			    0,
			    ResponseType.notInUseOrNotEquipped
			)
		    ),
		    "responseType",
		    5,
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
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' EmergencyDetails object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EmergencyDetails object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EmergencyDetails
