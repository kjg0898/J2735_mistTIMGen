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


package dsrc.addgrpd;

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type CITSBSM from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class CITSBSM extends Sequence {
    
    /**
     * The default constructor.
     */
    public CITSBSM()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CITSBSM(CITSADAS adas, dsrc.itis.ITIScodes typeEvent, 
		    dsrc.dsrc.LaneID laneID, DectLaneID curlane, 
		    OctetString cooperateID, IA5String url)
    {
	setAdas(adas);
	setTypeEvent(typeEvent);
	setLaneID(laneID);
	setCurlane(curlane);
	setCooperateID(cooperateID);
	setUrl(url);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CITSADAS();
	mComponents[1] = new dsrc.itis.ITIScodes();
	mComponents[2] = new dsrc.dsrc.LaneID();
	mComponents[3] = DectLaneID.unavailable;
	mComponents[4] = new OctetString();
	mComponents[5] = new IA5String();
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
		return new CITSADAS();
	    case 1:
		return new dsrc.itis.ITIScodes();
	    case 2:
		return new dsrc.dsrc.LaneID();
	    case 3:
		return DectLaneID.unavailable;
	    case 4:
		return new OctetString();
	    case 5:
		return new IA5String();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "adas"
    public CITSADAS getAdas()
    {
	return (CITSADAS)mComponents[0];
    }
    
    public void setAdas(CITSADAS adas)
    {
	mComponents[0] = adas;
    }
    
    public boolean hasAdas()
    {
	return componentIsPresent(0);
    }
    
    public void deleteAdas()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "typeEvent"
    public dsrc.itis.ITIScodes getTypeEvent()
    {
	return (dsrc.itis.ITIScodes)mComponents[1];
    }
    
    public void setTypeEvent(dsrc.itis.ITIScodes typeEvent)
    {
	mComponents[1] = typeEvent;
    }
    
    public boolean hasTypeEvent()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTypeEvent()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "laneID"
    public dsrc.dsrc.LaneID getLaneID()
    {
	return (dsrc.dsrc.LaneID)mComponents[2];
    }
    
    public void setLaneID(dsrc.dsrc.LaneID laneID)
    {
	mComponents[2] = laneID;
    }
    
    public boolean hasLaneID()
    {
	return componentIsPresent(2);
    }
    
    public void deleteLaneID()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "curlane"
    public DectLaneID getCurlane()
    {
	return (DectLaneID)mComponents[3];
    }
    
    public void setCurlane(DectLaneID curlane)
    {
	mComponents[3] = curlane;
    }
    
    public boolean hasCurlane()
    {
	return componentIsPresent(3);
    }
    
    public void deleteCurlane()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "cooperateID"
    public OctetString getCooperateID()
    {
	return (OctetString)mComponents[4];
    }
    
    public void setCooperateID(OctetString cooperateID)
    {
	mComponents[4] = cooperateID;
    }
    
    public boolean hasCooperateID()
    {
	return componentIsPresent(4);
    }
    
    public void deleteCooperateID()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "url"
    public IA5String getUrl()
    {
	return (IA5String)mComponents[5];
    }
    
    public void setUrl(IA5String url)
    {
	mComponents[5] = url;
    }
    
    public boolean hasUrl()
    {
	return componentIsPresent(5);
    }
    
    public void deleteUrl()
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
	    "dsrc.addgrpd",
	    "CITSBSM"
	),
	new QName (
	    "AddGrpD",
	    "CITSBSM"
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
				"dsrc.addgrpd",
				"CITSADAS"
			    ),
			    new QName (
				"AddGrpD",
				"CITSADAS"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSADAS"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSADAS"
				)
			    ),
			    0
			)
		    ),
		    "adas",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.itis",
				"ITIScodes"
			    ),
			    new QName (
				"ITIS",
				"ITIScodes"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new dsrc.itis.ITIScodes(0), 
				    new dsrc.itis.ITIScodes(65535),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(65535)
			    ),
			    null
			)
		    ),
		    "typeEvent",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"LaneID"
			    ),
			    new QName (
				"DSRC",
				"LaneID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new dsrc.dsrc.LaneID(0), 
				    new dsrc.dsrc.LaneID(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "laneID",
		    2,
		    3,
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
				"dsrc.addgrpd",
				"DectLaneID"
			    ),
			    new QName (
				"AddGrpD",
				"DectLaneID"
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
					"busOnlyLane",
					10
				    ),
				    new MemberListElement (
					"ctrBusLane",
					11
				    ),
				    new MemberListElement (
					"rdSdBusLane",
					12
				    ),
				    new MemberListElement (
					"mergingArea",
					13
				    ),
				    new MemberListElement (
					"accelerationLane",
					14
				    ),
				    new MemberListElement (
					"decelrationLane",
					15
				    ),
				    new MemberListElement (
					"rampLane",
					16
				    ),
				    new MemberListElement (
					"shoulderLane",
					17
				    ),
				    new MemberListElement (
					"carLane",
					20
				    ),
				    new MemberListElement (
					"car-1stLane",
					21
				    ),
				    new MemberListElement (
					"car-2ndLane",
					22
				    ),
				    new MemberListElement (
					"car-3rdLane",
					23
				    ),
				    new MemberListElement (
					"car-4thLane",
					24
				    ),
				    new MemberListElement (
					"car-5thLane",
					25
				    ),
				    new MemberListElement (
					"car-6thLane",
					26
				    ),
				    new MemberListElement (
					"car-7thLane",
					27
				    ),
				    new MemberListElement (
					"car-8thLane",
					28
				    ),
				    new MemberListElement (
					"car-9thLane",
					29
				    ),
				    new MemberListElement (
					"car-10thLane",
					30
				    ),
				    new MemberListElement (
					"car-11thLane",
					31
				    ),
				    new MemberListElement (
					"car-12thLane",
					32
				    ),
				    new MemberListElement (
					"car-13thLane",
					33
				    ),
				    new MemberListElement (
					"car-14thLane",
					34
				    ),
				    new MemberListElement (
					"car-15thLane",
					35
				    ),
				    new MemberListElement (
					"car-16thLane",
					36
				    ),
				    new MemberListElement (
					"car-17thLane",
					37
				    ),
				    new MemberListElement (
					"car-18thLane",
					38
				    ),
				    new MemberListElement (
					"car-19thLane",
					39
				    ),
				    new MemberListElement (
					"car-20thLane",
					40
				    ),
				    new MemberListElement (
					"etcLane",
					99
				    )
				}
			    ),
			    0,
			    DectLaneID.unavailable
			)
		    ),
		    "curlane",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"OctetString"
			    ),
			    new QName (
				"builtin",
				"OCTET STRING"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(16)
			    )
			)
		    ),
		    "cooperateID",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"IA5String"
			    ),
			    new QName (
				"builtin",
				"IA5String"
			    ),
			    274450,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(128),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    IA5StringPAInfo.pa
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(128)
			    ),
			    IA5StringPAInfo.paInfo
			)
		    ),
		    "url",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
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
     * Get the type descriptor (TypeInfo) of 'this' CITSBSM object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CITSBSM object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CITSBSM
