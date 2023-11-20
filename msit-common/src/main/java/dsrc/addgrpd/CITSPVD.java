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
 * Define the ASN1 Type CITSPVD from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class CITSPVD extends Sequence {
    
    /**
     * The default constructor.
     */
    public CITSPVD()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CITSPVD(INTEGER msgID, dsrc.dsrc.Acceleration acceleration, 
		    DectLaneID curlane, CITSADAS adas, EventDrowsy drowsy, 
		    DeviceMgmt devicemgmt, 
		    dsrc.dsrc.TransitStatus transitStatus, 
		    Worklanes worklanes, dsrc.dsrc.DDateTime workstart, 
		    dsrc.dsrc.DDateTime workend, INTEGER vehiclecnt, 
		    CITSVehicleValue vehicleInfo, 
		    dsrc.itis.ITIScodes typeEvent, Description description, 
		    CITSSVCLog serviceLogAll, CITSGYRO xyzvalue, Text text, 
		    Subtext subtext)
    {
	setMsgID(msgID);
	setAcceleration(acceleration);
	setCurlane(curlane);
	setAdas(adas);
	setDrowsy(drowsy);
	setDevicemgmt(devicemgmt);
	setTransitStatus(transitStatus);
	setWorklanes(worklanes);
	setWorkstart(workstart);
	setWorkend(workend);
	setVehiclecnt(vehiclecnt);
	setVehicleInfo(vehicleInfo);
	setTypeEvent(typeEvent);
	setDescription(description);
	setServiceLogAll(serviceLogAll);
	setXyzvalue(xyzvalue);
	setText(text);
	setSubtext(subtext);
    }
    
    /**
     * Construct with components.
     */
    public CITSPVD(long msgID, dsrc.dsrc.Acceleration acceleration, 
		    DectLaneID curlane, CITSADAS adas, EventDrowsy drowsy, 
		    DeviceMgmt devicemgmt, 
		    dsrc.dsrc.TransitStatus transitStatus, 
		    Worklanes worklanes, dsrc.dsrc.DDateTime workstart, 
		    dsrc.dsrc.DDateTime workend, long vehiclecnt, 
		    CITSVehicleValue vehicleInfo, 
		    dsrc.itis.ITIScodes typeEvent, Description description, 
		    CITSSVCLog serviceLogAll, CITSGYRO xyzvalue, Text text, 
		    Subtext subtext)
    {
	this(new INTEGER(msgID), acceleration, curlane, adas, drowsy, 
	     devicemgmt, transitStatus, worklanes, workstart, workend, 
	     new INTEGER(vehiclecnt), vehicleInfo, typeEvent, description, 
	     serviceLogAll, xyzvalue, text, subtext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new dsrc.dsrc.Acceleration();
	mComponents[2] = DectLaneID.unavailable;
	mComponents[3] = new CITSADAS();
	mComponents[4] = EventDrowsy.frontEyeOff;
	mComponents[5] = new DeviceMgmt();
	mComponents[6] = new dsrc.dsrc.TransitStatus();
	mComponents[7] = new Worklanes();
	mComponents[8] = new dsrc.dsrc.DDateTime();
	mComponents[9] = new dsrc.dsrc.DDateTime();
	mComponents[10] = new INTEGER();
	mComponents[11] = new CITSVehicleValue();
	mComponents[12] = new dsrc.itis.ITIScodes();
	mComponents[13] = new Description();
	mComponents[14] = new CITSSVCLog();
	mComponents[15] = new CITSGYRO();
	mComponents[16] = new Text();
	mComponents[17] = new Subtext();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[18];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new dsrc.dsrc.Acceleration();
	    case 2:
		return DectLaneID.unavailable;
	    case 3:
		return new CITSADAS();
	    case 4:
		return EventDrowsy.frontEyeOff;
	    case 5:
		return new DeviceMgmt();
	    case 6:
		return new dsrc.dsrc.TransitStatus();
	    case 7:
		return new Worklanes();
	    case 8:
		return new dsrc.dsrc.DDateTime();
	    case 9:
		return new dsrc.dsrc.DDateTime();
	    case 10:
		return new INTEGER();
	    case 11:
		return new CITSVehicleValue();
	    case 12:
		return new dsrc.itis.ITIScodes();
	    case 13:
		return new Description();
	    case 14:
		return new CITSSVCLog();
	    case 15:
		return new CITSGYRO();
	    case 16:
		return new Text();
	    case 17:
		return new Subtext();
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
    
    
    // Methods for field "acceleration"
    public dsrc.dsrc.Acceleration getAcceleration()
    {
	return (dsrc.dsrc.Acceleration)mComponents[1];
    }
    
    public void setAcceleration(dsrc.dsrc.Acceleration acceleration)
    {
	mComponents[1] = acceleration;
    }
    
    public boolean hasAcceleration()
    {
	return componentIsPresent(1);
    }
    
    public void deleteAcceleration()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "curlane"
    public DectLaneID getCurlane()
    {
	return (DectLaneID)mComponents[2];
    }
    
    public void setCurlane(DectLaneID curlane)
    {
	mComponents[2] = curlane;
    }
    
    public boolean hasCurlane()
    {
	return componentIsPresent(2);
    }
    
    public void deleteCurlane()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "adas"
    public CITSADAS getAdas()
    {
	return (CITSADAS)mComponents[3];
    }
    
    public void setAdas(CITSADAS adas)
    {
	mComponents[3] = adas;
    }
    
    public boolean hasAdas()
    {
	return componentIsPresent(3);
    }
    
    public void deleteAdas()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "drowsy"
    public EventDrowsy getDrowsy()
    {
	return (EventDrowsy)mComponents[4];
    }
    
    public void setDrowsy(EventDrowsy drowsy)
    {
	mComponents[4] = drowsy;
    }
    
    public boolean hasDrowsy()
    {
	return componentIsPresent(4);
    }
    
    public void deleteDrowsy()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "devicemgmt"
    public DeviceMgmt getDevicemgmt()
    {
	return (DeviceMgmt)mComponents[5];
    }
    
    public void setDevicemgmt(DeviceMgmt devicemgmt)
    {
	mComponents[5] = devicemgmt;
    }
    
    public boolean hasDevicemgmt()
    {
	return componentIsPresent(5);
    }
    
    public void deleteDevicemgmt()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "transitStatus"
    public dsrc.dsrc.TransitStatus getTransitStatus()
    {
	return (dsrc.dsrc.TransitStatus)mComponents[6];
    }
    
    public void setTransitStatus(dsrc.dsrc.TransitStatus transitStatus)
    {
	mComponents[6] = transitStatus;
    }
    
    public boolean hasTransitStatus()
    {
	return componentIsPresent(6);
    }
    
    public void deleteTransitStatus()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "worklanes"
    public Worklanes getWorklanes()
    {
	return (Worklanes)mComponents[7];
    }
    
    public void setWorklanes(Worklanes worklanes)
    {
	mComponents[7] = worklanes;
    }
    
    public boolean hasWorklanes()
    {
	return componentIsPresent(7);
    }
    
    public void deleteWorklanes()
    {
	setComponentAbsent(7);
    }
    
    
    
    /**
     * Define the ASN1 Type Worklanes from ASN1 Module AddGrpD.
     * @see SequenceOf
     */
    public static class Worklanes extends SequenceOf<dsrc.dsrc.LaneID> {
	
	/**
	 * The default constructor.
	 */
	public Worklanes()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Worklanes(dsrc.dsrc.LaneID[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new dsrc.dsrc.LaneID();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8007
		}
	    ),
	    new QName (
		"dsrc.addgrpd",
		"CITSPVD$Worklanes"
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
			new INTEGER(16),
			0
		    )
		)
	    ),
	    new Bounds (
		Long.valueOf(1),
		Long.valueOf(16)
	    ),
	    new TypeInfoRef (
		new QName (
		    "dsrc.dsrc",
		    "LaneID"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Worklanes object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Worklanes object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Worklanes

    // Methods for field "workstart"
    public dsrc.dsrc.DDateTime getWorkstart()
    {
	return (dsrc.dsrc.DDateTime)mComponents[8];
    }
    
    public void setWorkstart(dsrc.dsrc.DDateTime workstart)
    {
	mComponents[8] = workstart;
    }
    
    public boolean hasWorkstart()
    {
	return componentIsPresent(8);
    }
    
    public void deleteWorkstart()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "workend"
    public dsrc.dsrc.DDateTime getWorkend()
    {
	return (dsrc.dsrc.DDateTime)mComponents[9];
    }
    
    public void setWorkend(dsrc.dsrc.DDateTime workend)
    {
	mComponents[9] = workend;
    }
    
    public boolean hasWorkend()
    {
	return componentIsPresent(9);
    }
    
    public void deleteWorkend()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "vehiclecnt"
    public long getVehiclecnt()
    {
	return ((INTEGER)mComponents[10]).longValue();
    }
    
    public void setVehiclecnt(long vehiclecnt)
    {
	setVehiclecnt(new INTEGER(vehiclecnt));
    }
    
    public void setVehiclecnt(INTEGER vehiclecnt)
    {
	mComponents[10] = vehiclecnt;
    }
    
    public boolean hasVehiclecnt()
    {
	return componentIsPresent(10);
    }
    
    public void deleteVehiclecnt()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "vehicleInfo"
    public CITSVehicleValue getVehicleInfo()
    {
	return (CITSVehicleValue)mComponents[11];
    }
    
    public void setVehicleInfo(CITSVehicleValue vehicleInfo)
    {
	mComponents[11] = vehicleInfo;
    }
    
    public boolean hasVehicleInfo()
    {
	return componentIsPresent(11);
    }
    
    public void deleteVehicleInfo()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "typeEvent"
    public dsrc.itis.ITIScodes getTypeEvent()
    {
	return (dsrc.itis.ITIScodes)mComponents[12];
    }
    
    public void setTypeEvent(dsrc.itis.ITIScodes typeEvent)
    {
	mComponents[12] = typeEvent;
    }
    
    public boolean hasTypeEvent()
    {
	return componentIsPresent(12);
    }
    
    public void deleteTypeEvent()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "description"
    public Description getDescription()
    {
	return (Description)mComponents[13];
    }
    
    public void setDescription(Description description)
    {
	mComponents[13] = description;
    }
    
    public boolean hasDescription()
    {
	return componentIsPresent(13);
    }
    
    public void deleteDescription()
    {
	setComponentAbsent(13);
    }
    
    
    
    /**
     * Define the ASN1 Type Description from ASN1 Module AddGrpD.
     * @see SequenceOf
     */
    public static class Description extends SequenceOf<dsrc.itis.ITIScodes> {
	
	/**
	 * The default constructor.
	 */
	public Description()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Description(dsrc.itis.ITIScodes[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new dsrc.itis.ITIScodes();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x800d
		}
	    ),
	    new QName (
		"dsrc.addgrpd",
		"CITSPVD$Description"
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
		    "dsrc.itis",
		    "ITIScodes"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Description object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Description object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Description

    // Methods for field "serviceLogAll"
    public CITSSVCLog getServiceLogAll()
    {
	return (CITSSVCLog)mComponents[14];
    }
    
    public void setServiceLogAll(CITSSVCLog serviceLogAll)
    {
	mComponents[14] = serviceLogAll;
    }
    
    public boolean hasServiceLogAll()
    {
	return componentIsPresent(14);
    }
    
    public void deleteServiceLogAll()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "xyzvalue"
    public CITSGYRO getXyzvalue()
    {
	return (CITSGYRO)mComponents[15];
    }
    
    public void setXyzvalue(CITSGYRO xyzvalue)
    {
	mComponents[15] = xyzvalue;
    }
    
    public boolean hasXyzvalue()
    {
	return componentIsPresent(15);
    }
    
    public void deleteXyzvalue()
    {
	setComponentAbsent(15);
    }
    
    
    // Methods for field "text"
    public Text getText()
    {
	return (Text)mComponents[16];
    }
    
    public void setText(Text text)
    {
	mComponents[16] = text;
    }
    
    public boolean hasText()
    {
	return componentIsPresent(16);
    }
    
    public void deleteText()
    {
	setComponentAbsent(16);
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
		    (short)0x8010
		}
	    ),
	    new QName (
		"dsrc.addgrpd",
		"CITSPVD$Text"
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
	return (Subtext)mComponents[17];
    }
    
    public void setSubtext(Subtext subtext)
    {
	mComponents[17] = subtext;
    }
    
    public boolean hasSubtext()
    {
	return componentIsPresent(17);
    }
    
    public void deleteSubtext()
    {
	setComponentAbsent(17);
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
		    (short)0x8011
		}
	    ),
	    new QName (
		"dsrc.addgrpd",
		"CITSPVD$Subtext"
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
	    "CITSPVD"
	),
	new QName (
	    "AddGrpD",
	    "CITSPVD"
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
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Acceleration"
			    ),
			    new QName (
				"DSRC",
				"Acceleration"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new dsrc.dsrc.Acceleration(-2000), 
				    new dsrc.dsrc.Acceleration(2001),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-2000),
				Long.valueOf(2001)
			    ),
			    null
			)
		    ),
		    "acceleration",
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
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"EventDrowsy"
			    ),
			    new QName (
				"AddGrpD",
				"EventDrowsy"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"frontEyeOff",
					0
				    ),
				    new MemberListElement (
					"drowsyLight",
					1
				    ),
				    new MemberListElement (
					"drowsySerious",
					2
				    ),
				    new MemberListElement (
					"faceoff",
					3
				    ),
				    new MemberListElement (
					"smoking",
					4
				    ),
				    new MemberListElement (
					"phone",
					5
				    ),
				    new MemberListElement (
					"yawn",
					6
				    )
				}
			    ),
			    0,
			    EventDrowsy.frontEyeOff
			)
		    ),
		    "drowsy",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"DeviceMgmt"
			    ),
			    new QName (
				"AddGrpD",
				"DeviceMgmt"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(8)
				)
			    ),
			    new Bounds (
				Long.valueOf(8),
				Long.valueOf(8)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"noADASSignal",
					0
				    ),
				    new MemberListElement (
					"noDrowsySignal",
					1
				    ),
				    new MemberListElement (
					"noV2XSignal",
					2
				    ),
				    new MemberListElement (
					"noDispplaySignal",
					3
				    ),
				    new MemberListElement (
					"noDTGSignal",
					4
				    ),
				    new MemberListElement (
					"noGPSSignal",
					5
				    ),
				    new MemberListElement (
					"noCITSCenter",
					6
				    ),
				    new MemberListElement (
					"nohmistate",
					7
				    )
				}
			    )
			)
		    ),
		    "devicemgmt",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"TransitStatus"
			    ),
			    new QName (
				"DSRC",
				"TransitStatus"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(6)
				)
			    ),
			    new Bounds (
				Long.valueOf(6),
				Long.valueOf(6)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"none",
					0
				    ),
				    new MemberListElement (
					"anADAuse",
					1
				    ),
				    new MemberListElement (
					"aBikeLoad",
					2
				    ),
				    new MemberListElement (
					"doorOpen",
					3
				    ),
				    new MemberListElement (
					"occM",
					4
				    ),
				    new MemberListElement (
					"occL",
					5
				    )
				}
			    )
			)
		    ),
		    "transitStatus",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.addgrpd",
			    "CITSPVD$Worklanes"
			)
		    ),
		    "worklanes",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"DDateTime"
			    ),
			    new QName (
				"DSRC",
				"DDateTime"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "DDateTime"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "DDateTime"
				)
			    ),
			    0
			)
		    ),
		    "workstart",
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
				"dsrc.dsrc",
				"DDateTime"
			    ),
			    new QName (
				"DSRC",
				"DDateTime"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "DDateTime"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "DDateTime"
				)
			    ),
			    0
			)
		    ),
		    "workend",
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
				    new INTEGER(16777215),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(16777215)
			    ),
			    null
			)
		    ),
		    "vehiclecnt",
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
				"CITSVehicleValue"
			    ),
			    new QName (
				"AddGrpD",
				"CITSVehicleValue"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSVehicleValue"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSVehicleValue"
				)
			    ),
			    0
			)
		    ),
		    "vehicleInfo",
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
		    12,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.addgrpd",
			    "CITSPVD$Description"
			)
		    ),
		    "description",
		    13,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"CITSSVCLog"
			    ),
			    new QName (
				"AddGrpD",
				"CITSSVCLog"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSSVCLog"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSSVCLog"
				)
			    ),
			    0
			)
		    ),
		    "serviceLogAll",
		    14,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"CITSGYRO"
			    ),
			    new QName (
				"AddGrpD",
				"CITSGYRO"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSGYRO"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSGYRO"
				)
			    ),
			    0
			)
		    ),
		    "xyzvalue",
		    15,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.addgrpd",
			    "CITSPVD$Text"
			)
		    ),
		    "text",
		    16,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.addgrpd",
			    "CITSPVD$Subtext"
			)
		    ),
		    "subtext",
		    17,
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
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17)
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
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17)
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
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17)
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
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17)
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
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17)
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
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17)
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
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17)
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
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8011, 17)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CITSPVD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CITSPVD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CITSPVD
