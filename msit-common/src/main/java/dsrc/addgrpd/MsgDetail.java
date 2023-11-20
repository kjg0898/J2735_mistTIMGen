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
 * Define the ASN1 Type MsgDetail from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class MsgDetail extends Sequence {
    
    /**
     * The default constructor.
     */
    public MsgDetail()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MsgDetail(MsgChannel svcMsgSndChl, MsgType svcMsgType, 
		    DispLocation svcDispLocation, 
		    dsrc.itis.ITIScodes svcMsgEvent, INTEGER rcvMsgID)
    {
	setSvcMsgSndChl(svcMsgSndChl);
	setSvcMsgType(svcMsgType);
	setSvcDispLocation(svcDispLocation);
	setSvcMsgEvent(svcMsgEvent);
	setRcvMsgID(rcvMsgID);
    }
    
    /**
     * Construct with components.
     */
    public MsgDetail(MsgChannel svcMsgSndChl, MsgType svcMsgType, 
		    DispLocation svcDispLocation, 
		    dsrc.itis.ITIScodes svcMsgEvent, long rcvMsgID)
    {
	this(svcMsgSndChl, svcMsgType, svcDispLocation, svcMsgEvent, 
	     new INTEGER(rcvMsgID));
    }
    
    /**
     * Construct with required components.
     */
    public MsgDetail(MsgChannel svcMsgSndChl, MsgType svcMsgType, 
		    DispLocation svcDispLocation, 
		    dsrc.itis.ITIScodes svcMsgEvent)
    {
	setSvcMsgSndChl(svcMsgSndChl);
	setSvcMsgType(svcMsgType);
	setSvcDispLocation(svcDispLocation);
	setSvcMsgEvent(svcMsgEvent);
    }
    
    public void initComponents()
    {
	mComponents[0] = MsgChannel.waveCV2X;
	mComponents[1] = MsgType.bsm;
	mComponents[2] = DispLocation.pass;
	mComponents[3] = new dsrc.itis.ITIScodes();
	mComponents[4] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return MsgChannel.waveCV2X;
	    case 1:
		return MsgType.bsm;
	    case 2:
		return DispLocation.pass;
	    case 3:
		return new dsrc.itis.ITIScodes();
	    case 4:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "svcMsgSndChl"
    public MsgChannel getSvcMsgSndChl()
    {
	return (MsgChannel)mComponents[0];
    }
    
    public void setSvcMsgSndChl(MsgChannel svcMsgSndChl)
    {
	mComponents[0] = svcMsgSndChl;
    }
    
    
    // Methods for field "svcMsgType"
    public MsgType getSvcMsgType()
    {
	return (MsgType)mComponents[1];
    }
    
    public void setSvcMsgType(MsgType svcMsgType)
    {
	mComponents[1] = svcMsgType;
    }
    
    
    // Methods for field "svcDispLocation"
    public DispLocation getSvcDispLocation()
    {
	return (DispLocation)mComponents[2];
    }
    
    public void setSvcDispLocation(DispLocation svcDispLocation)
    {
	mComponents[2] = svcDispLocation;
    }
    
    
    // Methods for field "svcMsgEvent"
    public dsrc.itis.ITIScodes getSvcMsgEvent()
    {
	return (dsrc.itis.ITIScodes)mComponents[3];
    }
    
    public void setSvcMsgEvent(dsrc.itis.ITIScodes svcMsgEvent)
    {
	mComponents[3] = svcMsgEvent;
    }
    
    
    // Methods for field "rcvMsgID"
    public long getRcvMsgID()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setRcvMsgID(long rcvMsgID)
    {
	setRcvMsgID(new INTEGER(rcvMsgID));
    }
    
    public void setRcvMsgID(INTEGER rcvMsgID)
    {
	mComponents[4] = rcvMsgID;
    }
    
    public boolean hasRcvMsgID()
    {
	return componentIsPresent(4);
    }
    
    public void deleteRcvMsgID()
    {
	setComponentAbsent(4);
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
	    "MsgDetail"
	),
	new QName (
	    "AddGrpD",
	    "MsgDetail"
	),
	274450,
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
				"MsgChannel"
			    ),
			    new QName (
				"AddGrpD",
				"MsgChannel"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"waveCV2X",
					0
				    ),
				    new MemberListElement (
					"lte5G",
					1
				    ),
				    new MemberListElement (
					"display",
					2
				    ),
				    new MemberListElement (
					"outVehicle",
					3
				    ),
				    new MemberListElement (
					"inVehicle",
					4
				    ),
				    new MemberListElement (
					"adas",
					5
				    ),
				    new MemberListElement (
					"drowsy",
					6
				    )
				}
			    ),
			    0,
			    MsgChannel.waveCV2X
			)
		    ),
		    "svcMsgSndChl",
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
				"dsrc.addgrpd",
				"MsgType"
			    ),
			    new QName (
				"AddGrpD",
				"MsgType"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"bsm",
					0
				    ),
				    new MemberListElement (
					"spat",
					1
				    ),
				    new MemberListElement (
					"map",
					2
				    ),
				    new MemberListElement (
					"rsa",
					3
				    ),
				    new MemberListElement (
					"tim",
					4
				    ),
				    new MemberListElement (
					"adas",
					5
				    ),
				    new MemberListElement (
					"drowsy",
					6
				    ),
				    new MemberListElement (
					"psm",
					7
				    )
				}
			    ),
			    0,
			    MsgType.bsm
			)
		    ),
		    "svcMsgType",
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
				"dsrc.addgrpd",
				"DispLocation"
			    ),
			    new QName (
				"AddGrpD",
				"DispLocation"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"pass",
					0
				    ),
				    new MemberListElement (
					"entry",
					1
				    ),
				    new MemberListElement (
					"before_entry",
					2
				    ),
				    new MemberListElement (
					"timIn",
					10
				    ),
				    new MemberListElement (
					"timOut",
					11
				    ),
				    new MemberListElement (
					"ttcZone0",
					20
				    ),
				    new MemberListElement (
					"ttcZone1",
					21
				    ),
				    new MemberListElement (
					"ttcZone2",
					22
				    ),
				    new MemberListElement (
					"ttcZone3",
					23
				    ),
				    new MemberListElement (
					"before_zone",
					24
				    ),
				    new MemberListElement (
					"alert",
					30
				    ),
				    new MemberListElement (
					"approach",
					31
				    ),
				    new MemberListElement (
					"approach1",
					32
				    ),
				    new MemberListElement (
					"before_approach",
					33
				    ),
				    new MemberListElement (
					"others",
					99
				    )
				}
			    ),
			    0,
			    DispLocation.pass
			)
		    ),
		    "svcDispLocation",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "svcMsgEvent",
		    3,
		    2,
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
		    "rcvMsgID",
		    4,
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
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MsgDetail object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MsgDetail object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MsgDetail
