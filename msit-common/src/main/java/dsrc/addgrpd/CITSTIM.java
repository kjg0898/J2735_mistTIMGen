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
import com.oss.asn1.SequenceOf;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type CITSTIM from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class CITSTIM extends Sequence {
    
    /**
     * The default constructor.
     */
    public CITSTIM()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CITSTIM(INTEGER msgID, Text text, Subtext subtext, INTEGER zipcode, 
		    LinkID linkID, StopID stopID, DectLaneID fromlaneID, 
		    DectLaneID tolaneID, RIDEAlarm alarm, 
		    CITSWeatherInfo weatherInfo, CITSRestInfo servicearea, 
		    CITSTolgateLaneInfo tolgate)
    {
	setMsgID(msgID);
	setText(text);
	setSubtext(subtext);
	setZipcode(zipcode);
	setLinkID(linkID);
	setStopID(stopID);
	setFromlaneID(fromlaneID);
	setTolaneID(tolaneID);
	setAlarm(alarm);
	setWeatherInfo(weatherInfo);
	setServicearea(servicearea);
	setTolgate(tolgate);
    }
    
    /**
     * Construct with components.
     */
    public CITSTIM(long msgID, Text text, Subtext subtext, long zipcode, 
		    LinkID linkID, StopID stopID, DectLaneID fromlaneID, 
		    DectLaneID tolaneID, RIDEAlarm alarm, 
		    CITSWeatherInfo weatherInfo, CITSRestInfo servicearea, 
		    CITSTolgateLaneInfo tolgate)
    {
	this(new INTEGER(msgID), text, subtext, new INTEGER(zipcode), 
	     linkID, stopID, fromlaneID, tolaneID, alarm, weatherInfo, 
	     servicearea, tolgate);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new Text();
	mComponents[2] = new Subtext();
	mComponents[3] = new INTEGER();
	mComponents[4] = new LinkID();
	mComponents[5] = new StopID();
	mComponents[6] = DectLaneID.unavailable;
	mComponents[7] = DectLaneID.unavailable;
	mComponents[8] = RIDEAlarm.none;
	mComponents[9] = new CITSWeatherInfo();
	mComponents[10] = new CITSRestInfo();
	mComponents[11] = new CITSTolgateLaneInfo();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[12];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new Text();
	    case 2:
		return new Subtext();
	    case 3:
		return new INTEGER();
	    case 4:
		return new LinkID();
	    case 5:
		return new StopID();
	    case 6:
		return DectLaneID.unavailable;
	    case 7:
		return DectLaneID.unavailable;
	    case 8:
		return RIDEAlarm.none;
	    case 9:
		return new CITSWeatherInfo();
	    case 10:
		return new CITSRestInfo();
	    case 11:
		return new CITSTolgateLaneInfo();
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
    
    
    // Methods for field "text"
    public Text getText()
    {
	return (Text)mComponents[1];
    }
    
    public void setText(Text text)
    {
	mComponents[1] = text;
    }
    
    public boolean hasText()
    {
	return componentIsPresent(1);
    }
    
    public void deleteText()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type Text from ASN1 Module AddGrpD.
     * @see SequenceOf
     */
    public static class Text extends SequenceOf<CITSText> {
	
	/**
	 * The default constructor.
	 */
	public Text()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Text(CITSText[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new CITSText();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"dsrc.addgrpd",
		"CITSTIM$Text"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    274450,
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new INTEGER(1),
			new INTEGER(8),
			0
		    )
		)
	    ),
	    new Bounds (
		Long.valueOf(1),
		Long.valueOf(8)
	    ),
	    new TypeInfoRef (
		new QName (
		    "dsrc.addgrpd",
		    "CITSText"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Text object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Text object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Text

    // Methods for field "subtext"
    public Subtext getSubtext()
    {
	return (Subtext)mComponents[2];
    }
    
    public void setSubtext(Subtext subtext)
    {
	mComponents[2] = subtext;
    }
    
    public boolean hasSubtext()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSubtext()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type Subtext from ASN1 Module AddGrpD.
     * @see SequenceOf
     */
    public static class Subtext extends SequenceOf<CITSText> {
	
	/**
	 * The default constructor.
	 */
	public Subtext()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Subtext(CITSText[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new CITSText();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"dsrc.addgrpd",
		"CITSTIM$Subtext"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    274450,
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new INTEGER(1),
			new INTEGER(8),
			0
		    )
		)
	    ),
	    new Bounds (
		Long.valueOf(1),
		Long.valueOf(8)
	    ),
	    new TypeInfoRef (
		new QName (
		    "dsrc.addgrpd",
		    "CITSText"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Subtext object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Subtext object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Subtext

    // Methods for field "zipcode"
    public long getZipcode()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setZipcode(long zipcode)
    {
	setZipcode(new INTEGER(zipcode));
    }
    
    public void setZipcode(INTEGER zipcode)
    {
	mComponents[3] = zipcode;
    }
    
    public boolean hasZipcode()
    {
	return componentIsPresent(3);
    }
    
    public void deleteZipcode()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "linkID"
    public LinkID getLinkID()
    {
	return (LinkID)mComponents[4];
    }
    
    public void setLinkID(LinkID linkID)
    {
	mComponents[4] = linkID;
    }
    
    public boolean hasLinkID()
    {
	return componentIsPresent(4);
    }
    
    public void deleteLinkID()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "stopID"
    public StopID getStopID()
    {
	return (StopID)mComponents[5];
    }
    
    public void setStopID(StopID stopID)
    {
	mComponents[5] = stopID;
    }
    
    public boolean hasStopID()
    {
	return componentIsPresent(5);
    }
    
    public void deleteStopID()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "fromlaneID"
    public DectLaneID getFromlaneID()
    {
	return (DectLaneID)mComponents[6];
    }
    
    public void setFromlaneID(DectLaneID fromlaneID)
    {
	mComponents[6] = fromlaneID;
    }
    
    public boolean hasFromlaneID()
    {
	return componentIsPresent(6);
    }
    
    public void deleteFromlaneID()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "tolaneID"
    public DectLaneID getTolaneID()
    {
	return (DectLaneID)mComponents[7];
    }
    
    public void setTolaneID(DectLaneID tolaneID)
    {
	mComponents[7] = tolaneID;
    }
    
    public boolean hasTolaneID()
    {
	return componentIsPresent(7);
    }
    
    public void deleteTolaneID()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "alarm"
    public RIDEAlarm getAlarm()
    {
	return (RIDEAlarm)mComponents[8];
    }
    
    public void setAlarm(RIDEAlarm alarm)
    {
	mComponents[8] = alarm;
    }
    
    public boolean hasAlarm()
    {
	return componentIsPresent(8);
    }
    
    public void deleteAlarm()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "weatherInfo"
    public CITSWeatherInfo getWeatherInfo()
    {
	return (CITSWeatherInfo)mComponents[9];
    }
    
    public void setWeatherInfo(CITSWeatherInfo weatherInfo)
    {
	mComponents[9] = weatherInfo;
    }
    
    public boolean hasWeatherInfo()
    {
	return componentIsPresent(9);
    }
    
    public void deleteWeatherInfo()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "servicearea"
    public CITSRestInfo getServicearea()
    {
	return (CITSRestInfo)mComponents[10];
    }
    
    public void setServicearea(CITSRestInfo servicearea)
    {
	mComponents[10] = servicearea;
    }
    
    public boolean hasServicearea()
    {
	return componentIsPresent(10);
    }
    
    public void deleteServicearea()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "tolgate"
    public CITSTolgateLaneInfo getTolgate()
    {
	return (CITSTolgateLaneInfo)mComponents[11];
    }
    
    public void setTolgate(CITSTolgateLaneInfo tolgate)
    {
	mComponents[11] = tolgate;
    }
    
    public boolean hasTolgate()
    {
	return componentIsPresent(11);
    }
    
    public void deleteTolgate()
    {
	setComponentAbsent(11);
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
	    "CITSTIM"
	),
	new QName (
	    "AddGrpD",
	    "CITSTIM"
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
			new QName (
			    "dsrc.addgrpd",
			    "CITSTIM$Text"
			)
		    ),
		    "text",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.addgrpd",
			    "CITSTIM$Subtext"
			)
		    ),
		    "subtext",
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
				    new INTEGER(99999999),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(99999999)
			    ),
			    null
			)
		    ),
		    "zipcode",
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
		    "fromlaneID",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
		    "tolaneID",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"RIDEAlarm"
			    ),
			    new QName (
				"AddGrpD",
				"RIDEAlarm"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"none",
					0
				    ),
				    new MemberListElement (
					"geton",
					1
				    ),
				    new MemberListElement (
					"getoff",
					2
				    ),
				    new MemberListElement (
					"anADAuse",
					3
				    )
				}
			    ),
			    0,
			    RIDEAlarm.none
			)
		    ),
		    "alarm",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"CITSWeatherInfo"
			    ),
			    new QName (
				"AddGrpD",
				"CITSWeatherInfo"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSWeatherInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSWeatherInfo"
				)
			    ),
			    0
			)
		    ),
		    "weatherInfo",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"CITSRestInfo"
			    ),
			    new QName (
				"AddGrpD",
				"CITSRestInfo"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSRestInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSRestInfo"
				)
			    ),
			    0
			)
		    ),
		    "servicearea",
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"CITSTolgateLaneInfo"
			    ),
			    new QName (
				"AddGrpD",
				"CITSTolgateLaneInfo"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSTolgateLaneInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSTolgateLaneInfo"
				)
			    ),
			    0
			)
		    ),
		    "tolgate",
		    11,
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
			new TagDecoderElement((short)0x800b, 11)
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
			new TagDecoderElement((short)0x800b, 11)
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
			new TagDecoderElement((short)0x800b, 11)
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
			new TagDecoderElement((short)0x800b, 11)
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
			new TagDecoderElement((short)0x800b, 11)
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
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CITSTIM object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CITSTIM object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CITSTIM
