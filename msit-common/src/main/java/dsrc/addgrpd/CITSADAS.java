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

import com.oss.asn1.AbstractData;
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type CITSADAS from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class CITSADAS extends Sequence {
    
    /**
     * The default constructor.
     */
    public CITSADAS()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CITSADAS(ADASFCWSEventType fcws, ADASLDWSEventType ldws, 
		    ADASPCWSEventType pcws, ADASOTHERSEventType others, 
		    INTEGER ttcDistance, INTEGER ttcTime, 
		    dsrc.dsrc.Longitude _long, dsrc.dsrc.Latitude lat)
    {
	setFcws(fcws);
	setLdws(ldws);
	setPcws(pcws);
	setOthers(others);
	setTtcDistance(ttcDistance);
	setTtcTime(ttcTime);
	set_long(_long);
	setLat(lat);
    }
    
    /**
     * Construct with components.
     */
    public CITSADAS(ADASFCWSEventType fcws, ADASLDWSEventType ldws, 
		    ADASPCWSEventType pcws, ADASOTHERSEventType others, 
		    long ttcDistance, long ttcTime, dsrc.dsrc.Longitude _long, 
		    dsrc.dsrc.Latitude lat)
    {
	this(fcws, ldws, pcws, others, new INTEGER(ttcDistance), 
	     new INTEGER(ttcTime), _long, lat);
    }
    
    public void initComponents()
    {
	mComponents[0] = ADASFCWSEventType.nowarning;
	mComponents[1] = ADASLDWSEventType.nowarning;
	mComponents[2] = ADASPCWSEventType.nowarning;
	mComponents[3] = ADASOTHERSEventType.nowarning;
	mComponents[4] = new INTEGER();
	mComponents[5] = new INTEGER();
	mComponents[6] = new dsrc.dsrc.Longitude();
	mComponents[7] = new dsrc.dsrc.Latitude();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return ADASFCWSEventType.nowarning;
	    case 1:
		return ADASLDWSEventType.nowarning;
	    case 2:
		return ADASPCWSEventType.nowarning;
	    case 3:
		return ADASOTHERSEventType.nowarning;
	    case 4:
		return new INTEGER();
	    case 5:
		return new INTEGER();
	    case 6:
		return new dsrc.dsrc.Longitude();
	    case 7:
		return new dsrc.dsrc.Latitude();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "fcws"
    public ADASFCWSEventType getFcws()
    {
	return (ADASFCWSEventType)mComponents[0];
    }
    
    public void setFcws(ADASFCWSEventType fcws)
    {
	mComponents[0] = fcws;
    }
    
    public boolean hasFcws()
    {
	return componentIsPresent(0);
    }
    
    public void deleteFcws()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ldws"
    public ADASLDWSEventType getLdws()
    {
	return (ADASLDWSEventType)mComponents[1];
    }
    
    public void setLdws(ADASLDWSEventType ldws)
    {
	mComponents[1] = ldws;
    }
    
    public boolean hasLdws()
    {
	return componentIsPresent(1);
    }
    
    public void deleteLdws()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "pcws"
    public ADASPCWSEventType getPcws()
    {
	return (ADASPCWSEventType)mComponents[2];
    }
    
    public void setPcws(ADASPCWSEventType pcws)
    {
	mComponents[2] = pcws;
    }
    
    public boolean hasPcws()
    {
	return componentIsPresent(2);
    }
    
    public void deletePcws()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "others"
    public ADASOTHERSEventType getOthers()
    {
	return (ADASOTHERSEventType)mComponents[3];
    }
    
    public void setOthers(ADASOTHERSEventType others)
    {
	mComponents[3] = others;
    }
    
    public boolean hasOthers()
    {
	return componentIsPresent(3);
    }
    
    public void deleteOthers()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "ttcDistance"
    public long getTtcDistance()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setTtcDistance(long ttcDistance)
    {
	setTtcDistance(new INTEGER(ttcDistance));
    }
    
    public void setTtcDistance(INTEGER ttcDistance)
    {
	mComponents[4] = ttcDistance;
    }
    
    public boolean hasTtcDistance()
    {
	return componentIsPresent(4);
    }
    
    public void deleteTtcDistance()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "ttcTime"
    public long getTtcTime()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setTtcTime(long ttcTime)
    {
	setTtcTime(new INTEGER(ttcTime));
    }
    
    public void setTtcTime(INTEGER ttcTime)
    {
	mComponents[5] = ttcTime;
    }
    
    public boolean hasTtcTime()
    {
	return componentIsPresent(5);
    }
    
    public void deleteTtcTime()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "_long"
    public dsrc.dsrc.Longitude get_long()
    {
	return (dsrc.dsrc.Longitude)mComponents[6];
    }
    
    public void set_long(dsrc.dsrc.Longitude _long)
    {
	mComponents[6] = _long;
    }
    
    public boolean has_long()
    {
	return componentIsPresent(6);
    }
    
    public void delete_long()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "lat"
    public dsrc.dsrc.Latitude getLat()
    {
	return (dsrc.dsrc.Latitude)mComponents[7];
    }
    
    public void setLat(dsrc.dsrc.Latitude lat)
    {
	mComponents[7] = lat;
    }
    
    public boolean hasLat()
    {
	return componentIsPresent(7);
    }
    
    public void deleteLat()
    {
	setComponentAbsent(7);
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
	    "CITSADAS"
	),
	new QName (
	    "AddGrpD",
	    "CITSADAS"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"ADASFCWSEventType"
			    ),
			    new QName (
				"AddGrpD",
				"ADASFCWSEventType"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"nowarning",
					0
				    ),
				    new MemberListElement (
					"bus",
					1
				    ),
				    new MemberListElement (
					"car",
					2
				    ),
				    new MemberListElement (
					"truck",
					3
				    ),
				    new MemberListElement (
					"motors",
					4
				    ),
				    new MemberListElement (
					"special",
					5
				    ),
				    new MemberListElement (
					"bicycle",
					6
				    )
				}
			    ),
			    0,
			    ADASFCWSEventType.nowarning
			)
		    ),
		    "fcws",
		    0,
		    3,
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
				"dsrc.addgrpd",
				"ADASLDWSEventType"
			    ),
			    new QName (
				"AddGrpD",
				"ADASLDWSEventType"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"nowarning",
					0
				    ),
				    new MemberListElement (
					"left",
					1
				    ),
				    new MemberListElement (
					"right",
					2
				    ),
				    new MemberListElement (
					"warning",
					3
				    )
				}
			    ),
			    0,
			    ADASLDWSEventType.nowarning
			)
		    ),
		    "ldws",
		    1,
		    3,
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
				"dsrc.addgrpd",
				"ADASPCWSEventType"
			    ),
			    new QName (
				"AddGrpD",
				"ADASPCWSEventType"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"nowarning",
					0
				    ),
				    new MemberListElement (
					"pedestrian",
					1
				    )
				}
			    ),
			    0,
			    ADASPCWSEventType.nowarning
			)
		    ),
		    "pcws",
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
				"ADASOTHERSEventType"
			    ),
			    new QName (
				"AddGrpD",
				"ADASOTHERSEventType"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"nowarning",
					0
				    ),
				    new MemberListElement (
					"pothole",
					1
				    ),
				    new MemberListElement (
					"rubberconleft",
					2
				    ),
				    new MemberListElement (
					"rubberconright",
					3
				    ),
				    new MemberListElement (
					"rubberRightLeft",
					4
				    )
				}
			    ),
			    0,
			    ADASOTHERSEventType.nowarning
			)
		    ),
		    "others",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(255),
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
		    "ttcDistance",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(65535),
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
		    "ttcTime",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Longitude"
			    ),
			    new QName (
				"DSRC",
				"Longitude"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new dsrc.dsrc.Longitude(-1799999999), 
				    new dsrc.dsrc.Longitude(1800000001),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-1799999999),
				Long.valueOf(1800000001)
			    ),
			    null
			)
		    ),
		    "long",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Latitude"
			    ),
			    new QName (
				"DSRC",
				"Latitude"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new dsrc.dsrc.Latitude(-900000000), 
				    new dsrc.dsrc.Latitude(900000001),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-900000000),
				Long.valueOf(900000001)
			    ),
			    null
			)
		    ),
		    "lat",
		    7,
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
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CITSADAS object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CITSADAS object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CITSADAS
