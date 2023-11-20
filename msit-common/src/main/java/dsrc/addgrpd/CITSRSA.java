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
import com.oss.asn1.OctetString;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type CITSRSA from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class CITSRSA extends Sequence {
    
    /**
     * The default constructor.
     */
    public CITSRSA()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CITSRSA(INTEGER msgID, OctetString objID, INTEGER percent, 
		    INTEGER limitspeed, INTEGER lanewidth, LinkID linkID, 
		    DectLaneID eventlane, StopID stopID, CITSText text, 
		    dsrc.dsrc.MovementPhaseState eventState, 
		    INTEGER detectedObjCounts, CITSText sendUniqueId, 
		    INTEGER intersectionID, INTEGER signalGroupID)
    {
	setMsgID(msgID);
	setObjID(objID);
	setPercent(percent);
	setLimitspeed(limitspeed);
	setLanewidth(lanewidth);
	setLinkID(linkID);
	setEventlane(eventlane);
	setStopID(stopID);
	setText(text);
	setEventState(eventState);
	setDetectedObjCounts(detectedObjCounts);
	setSendUniqueId(sendUniqueId);
	setIntersectionID(intersectionID);
	setSignalGroupID(signalGroupID);
    }
    
    /**
     * Construct with components.
     */
    public CITSRSA(long msgID, OctetString objID, long percent, 
		    long limitspeed, long lanewidth, LinkID linkID, 
		    DectLaneID eventlane, StopID stopID, CITSText text, 
		    dsrc.dsrc.MovementPhaseState eventState, 
		    long detectedObjCounts, CITSText sendUniqueId, 
		    long intersectionID, long signalGroupID)
    {
	this(new INTEGER(msgID), objID, new INTEGER(percent), 
	     new INTEGER(limitspeed), new INTEGER(lanewidth), linkID, 
	     eventlane, stopID, text, eventState, 
	     new INTEGER(detectedObjCounts), sendUniqueId, 
	     new INTEGER(intersectionID), new INTEGER(signalGroupID));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new OctetString();
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
	mComponents[5] = new LinkID();
	mComponents[6] = DectLaneID.unavailable;
	mComponents[7] = new StopID();
	mComponents[8] = new CITSText();
	mComponents[9] = dsrc.dsrc.MovementPhaseState.unavailable;
	mComponents[10] = new INTEGER();
	mComponents[11] = new CITSText();
	mComponents[12] = new INTEGER();
	mComponents[13] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[14];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new OctetString();
	    case 2:
		return new INTEGER();
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    case 5:
		return new LinkID();
	    case 6:
		return DectLaneID.unavailable;
	    case 7:
		return new StopID();
	    case 8:
		return new CITSText();
	    case 9:
		return dsrc.dsrc.MovementPhaseState.unavailable;
	    case 10:
		return new INTEGER();
	    case 11:
		return new CITSText();
	    case 12:
		return new INTEGER();
	    case 13:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "msgID"
    public long getMsgID()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setMsgID(long msgID)
    {
	setMsgID(new INTEGER(msgID));
    }
    
    public void setMsgID(INTEGER msgID)
    {
	mComponents[0] = msgID;
    }
    
    public boolean hasMsgID()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMsgID()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "objID"
    public OctetString getObjID()
    {
	return (OctetString)mComponents[1];
    }
    
    public void setObjID(OctetString objID)
    {
	mComponents[1] = objID;
    }
    
    public boolean hasObjID()
    {
	return componentIsPresent(1);
    }
    
    public void deleteObjID()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "percent"
    public long getPercent()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setPercent(long percent)
    {
	setPercent(new INTEGER(percent));
    }
    
    public void setPercent(INTEGER percent)
    {
	mComponents[2] = percent;
    }
    
    public boolean hasPercent()
    {
	return componentIsPresent(2);
    }
    
    public void deletePercent()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "limitspeed"
    public long getLimitspeed()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setLimitspeed(long limitspeed)
    {
	setLimitspeed(new INTEGER(limitspeed));
    }
    
    public void setLimitspeed(INTEGER limitspeed)
    {
	mComponents[3] = limitspeed;
    }
    
    public boolean hasLimitspeed()
    {
	return componentIsPresent(3);
    }
    
    public void deleteLimitspeed()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "lanewidth"
    public long getLanewidth()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setLanewidth(long lanewidth)
    {
	setLanewidth(new INTEGER(lanewidth));
    }
    
    public void setLanewidth(INTEGER lanewidth)
    {
	mComponents[4] = lanewidth;
    }
    
    public boolean hasLanewidth()
    {
	return componentIsPresent(4);
    }
    
    public void deleteLanewidth()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "linkID"
    public LinkID getLinkID()
    {
	return (LinkID)mComponents[5];
    }
    
    public void setLinkID(LinkID linkID)
    {
	mComponents[5] = linkID;
    }
    
    public boolean hasLinkID()
    {
	return componentIsPresent(5);
    }
    
    public void deleteLinkID()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "eventlane"
    public DectLaneID getEventlane()
    {
	return (DectLaneID)mComponents[6];
    }
    
    public void setEventlane(DectLaneID eventlane)
    {
	mComponents[6] = eventlane;
    }
    
    public boolean hasEventlane()
    {
	return componentIsPresent(6);
    }
    
    public void deleteEventlane()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "stopID"
    public StopID getStopID()
    {
	return (StopID)mComponents[7];
    }
    
    public void setStopID(StopID stopID)
    {
	mComponents[7] = stopID;
    }
    
    public boolean hasStopID()
    {
	return componentIsPresent(7);
    }
    
    public void deleteStopID()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "text"
    public CITSText getText()
    {
	return (CITSText)mComponents[8];
    }
    
    public void setText(CITSText text)
    {
	mComponents[8] = text;
    }
    
    public boolean hasText()
    {
	return componentIsPresent(8);
    }
    
    public void deleteText()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "eventState"
    public dsrc.dsrc.MovementPhaseState getEventState()
    {
	return (dsrc.dsrc.MovementPhaseState)mComponents[9];
    }
    
    public void setEventState(dsrc.dsrc.MovementPhaseState eventState)
    {
	mComponents[9] = eventState;
    }
    
    public boolean hasEventState()
    {
	return componentIsPresent(9);
    }
    
    public void deleteEventState()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "detectedObjCounts"
    public long getDetectedObjCounts()
    {
	return ((INTEGER)mComponents[10]).longValue();
    }
    
    public void setDetectedObjCounts(long detectedObjCounts)
    {
	setDetectedObjCounts(new INTEGER(detectedObjCounts));
    }
    
    public void setDetectedObjCounts(INTEGER detectedObjCounts)
    {
	mComponents[10] = detectedObjCounts;
    }
    
    public boolean hasDetectedObjCounts()
    {
	return componentIsPresent(10);
    }
    
    public void deleteDetectedObjCounts()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "sendUniqueId"
    public CITSText getSendUniqueId()
    {
	return (CITSText)mComponents[11];
    }
    
    public void setSendUniqueId(CITSText sendUniqueId)
    {
	mComponents[11] = sendUniqueId;
    }
    
    public boolean hasSendUniqueId()
    {
	return componentIsPresent(11);
    }
    
    public void deleteSendUniqueId()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "intersectionID"
    public long getIntersectionID()
    {
	return ((INTEGER)mComponents[12]).longValue();
    }
    
    public void setIntersectionID(long intersectionID)
    {
	setIntersectionID(new INTEGER(intersectionID));
    }
    
    public void setIntersectionID(INTEGER intersectionID)
    {
	mComponents[12] = intersectionID;
    }
    
    public boolean hasIntersectionID()
    {
	return componentIsPresent(12);
    }
    
    public void deleteIntersectionID()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "signalGroupID"
    public long getSignalGroupID()
    {
	return ((INTEGER)mComponents[13]).longValue();
    }
    
    public void setSignalGroupID(long signalGroupID)
    {
	setSignalGroupID(new INTEGER(signalGroupID));
    }
    
    public void setSignalGroupID(INTEGER signalGroupID)
    {
	mComponents[13] = signalGroupID;
    }
    
    public boolean hasSignalGroupID()
    {
	return componentIsPresent(13);
    }
    
    public void deleteSignalGroupID()
    {
	setComponentAbsent(13);
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
	    "CITSRSA"
	),
	new QName (
	    "AddGrpD",
	    "CITSRSA"
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
		    "msgID",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "objID",
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
				    new INTEGER(100),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(100)
			    ),
			    null
			)
		    ),
		    "percent",
		    2,
		    3,
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
				    new INTEGER(65534),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(65534)
			    ),
			    null
			)
		    ),
		    "limitspeed",
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
				    new INTEGER(65534),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(65534)
			    ),
			    null
			)
		    ),
		    "lanewidth",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"LinkID"
			    ),
			    new QName (
				"AddGrpD",
				"LinkID"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(600),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "linkID",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
		    "eventlane",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"StopID"
			    ),
			    new QName (
				"AddGrpD",
				"StopID"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(600),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "stopID",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"CITSText"
			    ),
			    new QName (
				"AddGrpD",
				"CITSText"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(600),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "text",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"MovementPhaseState"
			    ),
			    new QName (
				"DSRC",
				"MovementPhaseState"
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
					"dark",
					1
				    ),
				    new MemberListElement (
					"stop-Then-Proceed",
					2
				    ),
				    new MemberListElement (
					"stop-And-Remain",
					3
				    ),
				    new MemberListElement (
					"pre-Movement",
					4
				    ),
				    new MemberListElement (
					"permissive-Movement-Allowed",
					5
				    ),
				    new MemberListElement (
					"protected-Movement-Allowed",
					6
				    ),
				    new MemberListElement (
					"permissive-clearance",
					7
				    ),
				    new MemberListElement (
					"protected-clearance",
					8
				    ),
				    new MemberListElement (
					"caution-Conflicting-Traffic",
					9
				    )
				}
			    ),
			    0,
			    dsrc.dsrc.MovementPhaseState.unavailable
			)
		    ),
		    "eventState",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
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
				    new INTEGER(1000),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(1000)
			    ),
			    null
			)
		    ),
		    "detectedObjCounts",
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"CITSText"
			    ),
			    new QName (
				"AddGrpD",
				"CITSText"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(600),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "sendUniqueId",
		    11,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
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
		    "intersectionID",
		    12,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
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
		    "signalGroupID",
		    13,
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
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
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
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CITSRSA object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CITSRSA object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CITSRSA
