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

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type TravelerDataFrame from ASN1 Module DSRC.
 * @see Sequence
 */

public class TravelerDataFrame extends Sequence {
    
    /**
     * The default constructor.
     */
    public TravelerDataFrame()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TravelerDataFrame(SSPindex sspTimRights, 
		    TravelerInfoType frameType, MsgId msgId, DYear startYear, 
		    MinuteOfTheYear startTime, MinutesDuration duratonTime, 
		    SignPrority priority, SSPindex sspLocationRights, 
		    Regions regions, SSPindex sspMsgRights1, 
		    SSPindex sspMsgRights2, Content content, URL_Short url)
    {
	setSspTimRights(sspTimRights);
	setFrameType(frameType);
	setMsgId(msgId);
	setStartYear(startYear);
	setStartTime(startTime);
	setDuratonTime(duratonTime);
	setPriority(priority);
	setSspLocationRights(sspLocationRights);
	setRegions(regions);
	setSspMsgRights1(sspMsgRights1);
	setSspMsgRights2(sspMsgRights2);
	setContent(content);
	setUrl(url);
    }
    
    /**
     * Construct with required components.
     */
    public TravelerDataFrame(SSPindex sspTimRights, 
		    TravelerInfoType frameType, MsgId msgId, 
		    MinuteOfTheYear startTime, MinutesDuration duratonTime, 
		    SignPrority priority, SSPindex sspLocationRights, 
		    Regions regions, SSPindex sspMsgRights1, 
		    SSPindex sspMsgRights2, Content content)
    {
	setSspTimRights(sspTimRights);
	setFrameType(frameType);
	setMsgId(msgId);
	setStartTime(startTime);
	setDuratonTime(duratonTime);
	setPriority(priority);
	setSspLocationRights(sspLocationRights);
	setRegions(regions);
	setSspMsgRights1(sspMsgRights1);
	setSspMsgRights2(sspMsgRights2);
	setContent(content);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SSPindex();
	mComponents[1] = TravelerInfoType.unknown;
	mComponents[2] = new MsgId();
	mComponents[3] = new DYear();
	mComponents[4] = new MinuteOfTheYear();
	mComponents[5] = new MinutesDuration();
	mComponents[6] = new SignPrority();
	mComponents[7] = new SSPindex();
	mComponents[8] = new Regions();
	mComponents[9] = new SSPindex();
	mComponents[10] = new SSPindex();
	mComponents[11] = new Content();
	mComponents[12] = new URL_Short();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[13];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new SSPindex();
	    case 1:
		return TravelerInfoType.unknown;
	    case 2:
		return new MsgId();
	    case 3:
		return new DYear();
	    case 4:
		return new MinuteOfTheYear();
	    case 5:
		return new MinutesDuration();
	    case 6:
		return new SignPrority();
	    case 7:
		return new SSPindex();
	    case 8:
		return new Regions();
	    case 9:
		return new SSPindex();
	    case 10:
		return new SSPindex();
	    case 11:
		return new Content();
	    case 12:
		return new URL_Short();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sspTimRights"
    public SSPindex getSspTimRights()
    {
	return (SSPindex)mComponents[0];
    }
    
    public void setSspTimRights(SSPindex sspTimRights)
    {
	mComponents[0] = sspTimRights;
    }
    
    
    // Methods for field "frameType"
    public TravelerInfoType getFrameType()
    {
	return (TravelerInfoType)mComponents[1];
    }
    
    public void setFrameType(TravelerInfoType frameType)
    {
	mComponents[1] = frameType;
    }
    
    
    // Methods for field "msgId"
    public MsgId getMsgId()
    {
	return (MsgId)mComponents[2];
    }
    
    public void setMsgId(MsgId msgId)
    {
	mComponents[2] = msgId;
    }
    
    
    
    /**
     * Define the ASN1 Type MsgId from ASN1 Module DSRC.
     * @see Choice
     */
    public static class MsgId extends Choice {
	
	/**
	 * The default constructor.
	 */
	public MsgId()
	{
	}
	
	public static final  int  furtherInfoID_chosen = 1;
	public static final  int  roadSignID_chosen = 2;
	
	// Methods for field "furtherInfoID"
	public static MsgId createMsgIdWithFurtherInfoID(FurtherInfoID furtherInfoID)
	{
	    MsgId __object = new MsgId();

	    __object.setFurtherInfoID(furtherInfoID);
	    return __object;
	}
	
	public boolean hasFurtherInfoID()
	{
	    return getChosenFlag() == furtherInfoID_chosen;
	}
	
	public FurtherInfoID getFurtherInfoID()
	{
	    if (hasFurtherInfoID())
		return (FurtherInfoID)mChosenValue;
	    else
		return null;
	}
	
	public void setFurtherInfoID(FurtherInfoID furtherInfoID)
	{
	    setChosenValue(furtherInfoID);
	    setChosenFlag(furtherInfoID_chosen);
	}
	
	
	// Methods for field "roadSignID"
	public static MsgId createMsgIdWithRoadSignID(RoadSignID roadSignID)
	{
	    MsgId __object = new MsgId();

	    __object.setRoadSignID(roadSignID);
	    return __object;
	}
	
	public boolean hasRoadSignID()
	{
	    return getChosenFlag() == roadSignID_chosen;
	}
	
	public RoadSignID getRoadSignID()
	{
	    if (hasRoadSignID())
		return (RoadSignID)mChosenValue;
	    else
		return null;
	}
	
	public void setRoadSignID(RoadSignID roadSignID)
	{
	    setChosenValue(roadSignID);
	    setChosenFlag(roadSignID_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case furtherInfoID_chosen:
		    return new FurtherInfoID();
		case roadSignID_chosen:
		    return new RoadSignID();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"TravelerDataFrame$MsgId"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
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
				    "FurtherInfoID"
				),
				new QName (
				    "DSRC",
				    "FurtherInfoID"
				),
				274450,
				new SizeConstraint (
				    new SingleValueConstraint (
					new INTEGER(2)
				    )
				),
				new Bounds (
				    Long.valueOf(2),
				    Long.valueOf(2)
				)
			    )
			),
			"furtherInfoID",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "RoadSignID"
				),
				new QName (
				    "DSRC",
				    "RoadSignID"
				),
				274450,
				null,
				new FieldsRef (
				    new QName (
					"dsrc.dsrc",
					"RoadSignID"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"dsrc.dsrc",
					"RoadSignID"
				    )
				),
				0
			    )
			),
			"roadSignID",
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
	 * Get the type descriptor (TypeInfo) of 'this' MsgId object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' MsgId object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for MsgId

    // Methods for field "startYear"
    public DYear getStartYear()
    {
	return (DYear)mComponents[3];
    }
    
    public void setStartYear(DYear startYear)
    {
	mComponents[3] = startYear;
    }
    
    public boolean hasStartYear()
    {
	return componentIsPresent(3);
    }
    
    public void deleteStartYear()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "startTime"
    public MinuteOfTheYear getStartTime()
    {
	return (MinuteOfTheYear)mComponents[4];
    }
    
    public void setStartTime(MinuteOfTheYear startTime)
    {
	mComponents[4] = startTime;
    }
    
    
    // Methods for field "duratonTime"
    public MinutesDuration getDuratonTime()
    {
	return (MinutesDuration)mComponents[5];
    }
    
    public void setDuratonTime(MinutesDuration duratonTime)
    {
	mComponents[5] = duratonTime;
    }
    
    
    // Methods for field "priority"
    public SignPrority getPriority()
    {
	return (SignPrority)mComponents[6];
    }
    
    public void setPriority(SignPrority priority)
    {
	mComponents[6] = priority;
    }
    
    
    // Methods for field "sspLocationRights"
    public SSPindex getSspLocationRights()
    {
	return (SSPindex)mComponents[7];
    }
    
    public void setSspLocationRights(SSPindex sspLocationRights)
    {
	mComponents[7] = sspLocationRights;
    }
    
    
    // Methods for field "regions"
    public Regions getRegions()
    {
	return (Regions)mComponents[8];
    }
    
    public void setRegions(Regions regions)
    {
	mComponents[8] = regions;
    }
    
    
    
    /**
     * Define the ASN1 Type Regions from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class Regions extends SequenceOf<GeographicalPath> {
	
	/**
	 * The default constructor.
	 */
	public Regions()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Regions(GeographicalPath[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new GeographicalPath();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8008
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"TravelerDataFrame$Regions"
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
		    "GeographicalPath"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Regions object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Regions object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Regions

    // Methods for field "sspMsgRights1"
    public SSPindex getSspMsgRights1()
    {
	return (SSPindex)mComponents[9];
    }
    
    public void setSspMsgRights1(SSPindex sspMsgRights1)
    {
	mComponents[9] = sspMsgRights1;
    }
    
    
    // Methods for field "sspMsgRights2"
    public SSPindex getSspMsgRights2()
    {
	return (SSPindex)mComponents[10];
    }
    
    public void setSspMsgRights2(SSPindex sspMsgRights2)
    {
	mComponents[10] = sspMsgRights2;
    }
    
    
    // Methods for field "content"
    public Content getContent()
    {
	return (Content)mComponents[11];
    }
    
    public void setContent(Content content)
    {
	mComponents[11] = content;
    }
    
    
    
    /**
     * Define the ASN1 Type Content from ASN1 Module DSRC.
     * @see Choice
     */
    public static class Content extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Content()
	{
	}
	
	public static final  int  advisory_chosen = 1;
	public static final  int  workZone_chosen = 2;
	public static final  int  genericSign_chosen = 3;
	public static final  int  speedLimit_chosen = 4;
	public static final  int  exitService_chosen = 5;
	
	// Methods for field "advisory"
	public static Content createContentWithAdvisory(dsrc.itis.ITIScodesAndText advisory)
	{
	    Content __object = new Content();

	    __object.setAdvisory(advisory);
	    return __object;
	}
	
	public boolean hasAdvisory()
	{
	    return getChosenFlag() == advisory_chosen;
	}
	
	public dsrc.itis.ITIScodesAndText getAdvisory()
	{
	    if (hasAdvisory())
		return (dsrc.itis.ITIScodesAndText)mChosenValue;
	    else
		return null;
	}
	
	public void setAdvisory(dsrc.itis.ITIScodesAndText advisory)
	{
	    setChosenValue(advisory);
	    setChosenFlag(advisory_chosen);
	}
	
	
	// Methods for field "workZone"
	public static Content createContentWithWorkZone(WorkZone workZone)
	{
	    Content __object = new Content();

	    __object.setWorkZone(workZone);
	    return __object;
	}
	
	public boolean hasWorkZone()
	{
	    return getChosenFlag() == workZone_chosen;
	}
	
	public WorkZone getWorkZone()
	{
	    if (hasWorkZone())
		return (WorkZone)mChosenValue;
	    else
		return null;
	}
	
	public void setWorkZone(WorkZone workZone)
	{
	    setChosenValue(workZone);
	    setChosenFlag(workZone_chosen);
	}
	
	
	// Methods for field "genericSign"
	public static Content createContentWithGenericSign(GenericSignage genericSign)
	{
	    Content __object = new Content();

	    __object.setGenericSign(genericSign);
	    return __object;
	}
	
	public boolean hasGenericSign()
	{
	    return getChosenFlag() == genericSign_chosen;
	}
	
	public GenericSignage getGenericSign()
	{
	    if (hasGenericSign())
		return (GenericSignage)mChosenValue;
	    else
		return null;
	}
	
	public void setGenericSign(GenericSignage genericSign)
	{
	    setChosenValue(genericSign);
	    setChosenFlag(genericSign_chosen);
	}
	
	
	// Methods for field "speedLimit"
	public static Content createContentWithSpeedLimit(SpeedLimit speedLimit)
	{
	    Content __object = new Content();

	    __object.setSpeedLimit(speedLimit);
	    return __object;
	}
	
	public boolean hasSpeedLimit()
	{
	    return getChosenFlag() == speedLimit_chosen;
	}
	
	public SpeedLimit getSpeedLimit()
	{
	    if (hasSpeedLimit())
		return (SpeedLimit)mChosenValue;
	    else
		return null;
	}
	
	public void setSpeedLimit(SpeedLimit speedLimit)
	{
	    setChosenValue(speedLimit);
	    setChosenFlag(speedLimit_chosen);
	}
	
	
	// Methods for field "exitService"
	public static Content createContentWithExitService(ExitService exitService)
	{
	    Content __object = new Content();

	    __object.setExitService(exitService);
	    return __object;
	}
	
	public boolean hasExitService()
	{
	    return getChosenFlag() == exitService_chosen;
	}
	
	public ExitService getExitService()
	{
	    if (hasExitService())
		return (ExitService)mChosenValue;
	    else
		return null;
	}
	
	public void setExitService(ExitService exitService)
	{
	    setChosenValue(exitService);
	    setChosenFlag(exitService_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case advisory_chosen:
		    return new dsrc.itis.ITIScodesAndText();
		case workZone_chosen:
		    return new WorkZone();
		case genericSign_chosen:
		    return new GenericSignage();
		case speedLimit_chosen:
		    return new SpeedLimit();
		case exitService_chosen:
		    return new ExitService();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x800b
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"TravelerDataFrame$Content"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    274450,
	    null,
	    new FieldsDict (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "dsrc.itis",
				    "ITIScodesAndText"
				),
				new QName (
				    "ITIS",
				    "ITIScodesAndText"
				),
				274450,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(100),
					    0
					)
				    )
				),
				new Bounds (
				    Long.valueOf(1),
				    Long.valueOf(100)
				),
				new TypeInfoRef (
				    new QName (
					"dsrc.itis",
					"ITIScodesAndText$Sequence_"
				    )
				)
			    )
			),
			"advisory",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "WorkZone"
				),
				new QName (
				    "DSRC",
				    "WorkZone"
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
					"WorkZone$Sequence_"
				    )
				)
			    )
			),
			"workZone",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "GenericSignage"
				),
				new QName (
				    "DSRC",
				    "GenericSignage"
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
					"GenericSignage$Sequence_"
				    )
				)
			    )
			),
			"genericSign",
			2,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8003
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "SpeedLimit"
				),
				new QName (
				    "DSRC",
				    "SpeedLimit"
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
					"SpeedLimit$Sequence_"
				    )
				)
			    )
			),
			"speedLimit",
			3,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8004
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "ExitService"
				),
				new QName (
				    "DSRC",
				    "ExitService"
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
					"ExitService$Sequence_"
				    )
				)
			    )
			),
			"exitService",
			4,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1),
		    new TagDecoderElement((short)0x8002, 2),
		    new TagDecoderElement((short)0x8003, 3),
		    new TagDecoderElement((short)0x8004, 4)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Content object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Content object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Content

    // Methods for field "url"
    public URL_Short getUrl()
    {
	return (URL_Short)mComponents[12];
    }
    
    public void setUrl(URL_Short url)
    {
	mComponents[12] = url;
    }
    
    public boolean hasUrl()
    {
	return componentIsPresent(12);
    }
    
    public void deleteUrl()
    {
	setComponentAbsent(12);
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
	    "TravelerDataFrame"
	),
	new QName (
	    "DSRC",
	    "TravelerDataFrame"
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
		    "sspTimRights",
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
				"TravelerInfoType"
			    ),
			    new QName (
				"DSRC",
				"TravelerInfoType"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unknown",
					0
				    ),
				    new MemberListElement (
					"advisory",
					1
				    ),
				    new MemberListElement (
					"roadSignage",
					2
				    ),
				    new MemberListElement (
					"commercialSignage",
					3
				    )
				}
			    ),
			    0,
			    TravelerInfoType.unknown
			)
		    ),
		    "frameType",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "TravelerDataFrame$MsgId"
			)
		    ),
		    "msgId",
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
				"dsrc.dsrc",
				"DYear"
			    ),
			    new QName (
				"DSRC",
				"DYear"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DYear(0), 
				    new DYear(4095),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(4095)
			    ),
			    null
			)
		    ),
		    "startYear",
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
				"dsrc.dsrc",
				"MinuteOfTheYear"
			    ),
			    new QName (
				"DSRC",
				"MinuteOfTheYear"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MinuteOfTheYear(0), 
				    new MinuteOfTheYear(527040),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(527040)
			    ),
			    null
			)
		    ),
		    "startTime",
		    4,
		    2,
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
				"dsrc.dsrc",
				"MinutesDuration"
			    ),
			    new QName (
				"DSRC",
				"MinutesDuration"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MinutesDuration(0), 
				    new MinutesDuration(32000),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(32000)
			    ),
			    null
			)
		    ),
		    "duratonTime",
		    5,
		    2,
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
				"SignPrority"
			    ),
			    new QName (
				"DSRC",
				"SignPrority"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SignPrority(0), 
				    new SignPrority(7),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(7)
			    ),
			    null
			)
		    ),
		    "priority",
		    6,
		    2,
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
		    "sspLocationRights",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "TravelerDataFrame$Regions"
			)
		    ),
		    "regions",
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
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
		    "sspMsgRights1",
		    9,
		    2,
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
		    "sspMsgRights2",
		    10,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "TravelerDataFrame$Content"
			)
		    ),
		    "content",
		    11,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"URL_Short"
			    ),
			    new QName (
				"DSRC",
				"URL-Short"
			    ),
			    274450,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(15),
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
				Long.valueOf(15)
			    ),
			    IA5StringPAInfo.paInfo
			)
		    ),
		    "url",
		    12,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TravelerDataFrame object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TravelerDataFrame object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TravelerDataFrame
