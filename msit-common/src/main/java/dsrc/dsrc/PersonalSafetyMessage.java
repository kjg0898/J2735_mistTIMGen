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
 * Define the ASN1 Type PersonalSafetyMessage from ASN1 Module DSRC.
 * @see Sequence
 */

public class PersonalSafetyMessage extends Sequence {
    
    /**
     * The default constructor.
     */
    public PersonalSafetyMessage()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PersonalSafetyMessage(PersonalDeviceUserType basicType, 
		    DSecond secMark, MsgCount msgCnt, TemporaryID id, 
		    Position3D position, PositionalAccuracy accuracy, 
		    Velocity speed, Heading heading, 
		    AccelerationSet4Way accelSet, PathHistory pathHistory, 
		    PathPrediction pathPrediction, 
		    PropelledInformation propulsion, 
		    PersonalDeviceUsageState useState, 
		    PersonalCrossingRequest crossRequest, 
		    PersonalCrossingInProgress crossState, 
		    NumberOfParticipantsInCluster clusterSize, 
		    PersonalClusterRadius clusterRadius, 
		    PublicSafetyEventResponderWorkerType eventResponderType, 
		    PublicSafetyAndRoadWorkerActivity activityType, 
		    PublicSafetyDirectingTrafficSubType activitySubType, 
		    PersonalAssistive assistType, UserSizeAndBehaviour sizing, 
		    Attachment attachment, AttachmentRadius attachmentRadius, 
		    AnimalType animalType, Regional regional)
    {
	setBasicType(basicType);
	setSecMark(secMark);
	setMsgCnt(msgCnt);
	setId(id);
	setPosition(position);
	setAccuracy(accuracy);
	setSpeed(speed);
	setHeading(heading);
	setAccelSet(accelSet);
	setPathHistory(pathHistory);
	setPathPrediction(pathPrediction);
	setPropulsion(propulsion);
	setUseState(useState);
	setCrossRequest(crossRequest);
	setCrossState(crossState);
	setClusterSize(clusterSize);
	setClusterRadius(clusterRadius);
	setEventResponderType(eventResponderType);
	setActivityType(activityType);
	setActivitySubType(activitySubType);
	setAssistType(assistType);
	setSizing(sizing);
	setAttachment(attachment);
	setAttachmentRadius(attachmentRadius);
	setAnimalType(animalType);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public PersonalSafetyMessage(PersonalDeviceUserType basicType, 
		    DSecond secMark, MsgCount msgCnt, TemporaryID id, 
		    Position3D position, PositionalAccuracy accuracy, 
		    Velocity speed, Heading heading)
    {
	setBasicType(basicType);
	setSecMark(secMark);
	setMsgCnt(msgCnt);
	setId(id);
	setPosition(position);
	setAccuracy(accuracy);
	setSpeed(speed);
	setHeading(heading);
    }
    
    public void initComponents()
    {
	mComponents[0] = PersonalDeviceUserType.unavailable;
	mComponents[1] = new DSecond();
	mComponents[2] = new MsgCount();
	mComponents[3] = new TemporaryID();
	mComponents[4] = new Position3D();
	mComponents[5] = new PositionalAccuracy();
	mComponents[6] = new Velocity();
	mComponents[7] = new Heading();
	mComponents[8] = new AccelerationSet4Way();
	mComponents[9] = new PathHistory();
	mComponents[10] = new PathPrediction();
	mComponents[11] = new PropelledInformation();
	mComponents[12] = new PersonalDeviceUsageState();
	mComponents[13] = new PersonalCrossingRequest();
	mComponents[14] = new PersonalCrossingInProgress();
	mComponents[15] = NumberOfParticipantsInCluster.unavailable;
	mComponents[16] = new PersonalClusterRadius();
	mComponents[17] = PublicSafetyEventResponderWorkerType.unavailable;
	mComponents[18] = new PublicSafetyAndRoadWorkerActivity();
	mComponents[19] = new PublicSafetyDirectingTrafficSubType();
	mComponents[20] = new PersonalAssistive();
	mComponents[21] = new UserSizeAndBehaviour();
	mComponents[22] = Attachment.unavailable;
	mComponents[23] = new AttachmentRadius();
	mComponents[24] = AnimalType.unavailable;
	mComponents[25] = new Regional();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[26];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return PersonalDeviceUserType.unavailable;
	    case 1:
		return new DSecond();
	    case 2:
		return new MsgCount();
	    case 3:
		return new TemporaryID();
	    case 4:
		return new Position3D();
	    case 5:
		return new PositionalAccuracy();
	    case 6:
		return new Velocity();
	    case 7:
		return new Heading();
	    case 8:
		return new AccelerationSet4Way();
	    case 9:
		return new PathHistory();
	    case 10:
		return new PathPrediction();
	    case 11:
		return new PropelledInformation();
	    case 12:
		return new PersonalDeviceUsageState();
	    case 13:
		return new PersonalCrossingRequest();
	    case 14:
		return new PersonalCrossingInProgress();
	    case 15:
		return NumberOfParticipantsInCluster.unavailable;
	    case 16:
		return new PersonalClusterRadius();
	    case 17:
		return PublicSafetyEventResponderWorkerType.unavailable;
	    case 18:
		return new PublicSafetyAndRoadWorkerActivity();
	    case 19:
		return new PublicSafetyDirectingTrafficSubType();
	    case 20:
		return new PersonalAssistive();
	    case 21:
		return new UserSizeAndBehaviour();
	    case 22:
		return Attachment.unavailable;
	    case 23:
		return new AttachmentRadius();
	    case 24:
		return AnimalType.unavailable;
	    case 25:
		return new Regional();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "basicType"
    public PersonalDeviceUserType getBasicType()
    {
	return (PersonalDeviceUserType)mComponents[0];
    }
    
    public void setBasicType(PersonalDeviceUserType basicType)
    {
	mComponents[0] = basicType;
    }
    
    
    // Methods for field "secMark"
    public DSecond getSecMark()
    {
	return (DSecond)mComponents[1];
    }
    
    public void setSecMark(DSecond secMark)
    {
	mComponents[1] = secMark;
    }
    
    
    // Methods for field "msgCnt"
    public MsgCount getMsgCnt()
    {
	return (MsgCount)mComponents[2];
    }
    
    public void setMsgCnt(MsgCount msgCnt)
    {
	mComponents[2] = msgCnt;
    }
    
    
    // Methods for field "id"
    public TemporaryID getId()
    {
	return (TemporaryID)mComponents[3];
    }
    
    public void setId(TemporaryID id)
    {
	mComponents[3] = id;
    }
    
    
    // Methods for field "position"
    public Position3D getPosition()
    {
	return (Position3D)mComponents[4];
    }
    
    public void setPosition(Position3D position)
    {
	mComponents[4] = position;
    }
    
    
    // Methods for field "accuracy"
    public PositionalAccuracy getAccuracy()
    {
	return (PositionalAccuracy)mComponents[5];
    }
    
    public void setAccuracy(PositionalAccuracy accuracy)
    {
	mComponents[5] = accuracy;
    }
    
    
    // Methods for field "speed"
    public Velocity getSpeed()
    {
	return (Velocity)mComponents[6];
    }
    
    public void setSpeed(Velocity speed)
    {
	mComponents[6] = speed;
    }
    
    
    // Methods for field "heading"
    public Heading getHeading()
    {
	return (Heading)mComponents[7];
    }
    
    public void setHeading(Heading heading)
    {
	mComponents[7] = heading;
    }
    
    
    // Methods for field "accelSet"
    public AccelerationSet4Way getAccelSet()
    {
	return (AccelerationSet4Way)mComponents[8];
    }
    
    public void setAccelSet(AccelerationSet4Way accelSet)
    {
	mComponents[8] = accelSet;
    }
    
    public boolean hasAccelSet()
    {
	return componentIsPresent(8);
    }
    
    public void deleteAccelSet()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "pathHistory"
    public PathHistory getPathHistory()
    {
	return (PathHistory)mComponents[9];
    }
    
    public void setPathHistory(PathHistory pathHistory)
    {
	mComponents[9] = pathHistory;
    }
    
    public boolean hasPathHistory()
    {
	return componentIsPresent(9);
    }
    
    public void deletePathHistory()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "pathPrediction"
    public PathPrediction getPathPrediction()
    {
	return (PathPrediction)mComponents[10];
    }
    
    public void setPathPrediction(PathPrediction pathPrediction)
    {
	mComponents[10] = pathPrediction;
    }
    
    public boolean hasPathPrediction()
    {
	return componentIsPresent(10);
    }
    
    public void deletePathPrediction()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "propulsion"
    public PropelledInformation getPropulsion()
    {
	return (PropelledInformation)mComponents[11];
    }
    
    public void setPropulsion(PropelledInformation propulsion)
    {
	mComponents[11] = propulsion;
    }
    
    public boolean hasPropulsion()
    {
	return componentIsPresent(11);
    }
    
    public void deletePropulsion()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "useState"
    public PersonalDeviceUsageState getUseState()
    {
	return (PersonalDeviceUsageState)mComponents[12];
    }
    
    public void setUseState(PersonalDeviceUsageState useState)
    {
	mComponents[12] = useState;
    }
    
    public boolean hasUseState()
    {
	return componentIsPresent(12);
    }
    
    public void deleteUseState()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "crossRequest"
    public PersonalCrossingRequest getCrossRequest()
    {
	return (PersonalCrossingRequest)mComponents[13];
    }
    
    public void setCrossRequest(PersonalCrossingRequest crossRequest)
    {
	mComponents[13] = crossRequest;
    }
    
    public boolean hasCrossRequest()
    {
	return componentIsPresent(13);
    }
    
    public void deleteCrossRequest()
    {
	setComponentAbsent(13);
    }
    
    
    // Methods for field "crossState"
    public PersonalCrossingInProgress getCrossState()
    {
	return (PersonalCrossingInProgress)mComponents[14];
    }
    
    public void setCrossState(PersonalCrossingInProgress crossState)
    {
	mComponents[14] = crossState;
    }
    
    public boolean hasCrossState()
    {
	return componentIsPresent(14);
    }
    
    public void deleteCrossState()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "clusterSize"
    public NumberOfParticipantsInCluster getClusterSize()
    {
	return (NumberOfParticipantsInCluster)mComponents[15];
    }
    
    public void setClusterSize(NumberOfParticipantsInCluster clusterSize)
    {
	mComponents[15] = clusterSize;
    }
    
    public boolean hasClusterSize()
    {
	return componentIsPresent(15);
    }
    
    public void deleteClusterSize()
    {
	setComponentAbsent(15);
    }
    
    
    // Methods for field "clusterRadius"
    public PersonalClusterRadius getClusterRadius()
    {
	return (PersonalClusterRadius)mComponents[16];
    }
    
    public void setClusterRadius(PersonalClusterRadius clusterRadius)
    {
	mComponents[16] = clusterRadius;
    }
    
    public boolean hasClusterRadius()
    {
	return componentIsPresent(16);
    }
    
    public void deleteClusterRadius()
    {
	setComponentAbsent(16);
    }
    
    
    // Methods for field "eventResponderType"
    public PublicSafetyEventResponderWorkerType getEventResponderType()
    {
	return (PublicSafetyEventResponderWorkerType)mComponents[17];
    }
    
    public void setEventResponderType(PublicSafetyEventResponderWorkerType eventResponderType)
    {
	mComponents[17] = eventResponderType;
    }
    
    public boolean hasEventResponderType()
    {
	return componentIsPresent(17);
    }
    
    public void deleteEventResponderType()
    {
	setComponentAbsent(17);
    }
    
    
    // Methods for field "activityType"
    public PublicSafetyAndRoadWorkerActivity getActivityType()
    {
	return (PublicSafetyAndRoadWorkerActivity)mComponents[18];
    }
    
    public void setActivityType(PublicSafetyAndRoadWorkerActivity activityType)
    {
	mComponents[18] = activityType;
    }
    
    public boolean hasActivityType()
    {
	return componentIsPresent(18);
    }
    
    public void deleteActivityType()
    {
	setComponentAbsent(18);
    }
    
    
    // Methods for field "activitySubType"
    public PublicSafetyDirectingTrafficSubType getActivitySubType()
    {
	return (PublicSafetyDirectingTrafficSubType)mComponents[19];
    }
    
    public void setActivitySubType(PublicSafetyDirectingTrafficSubType activitySubType)
    {
	mComponents[19] = activitySubType;
    }
    
    public boolean hasActivitySubType()
    {
	return componentIsPresent(19);
    }
    
    public void deleteActivitySubType()
    {
	setComponentAbsent(19);
    }
    
    
    // Methods for field "assistType"
    public PersonalAssistive getAssistType()
    {
	return (PersonalAssistive)mComponents[20];
    }
    
    public void setAssistType(PersonalAssistive assistType)
    {
	mComponents[20] = assistType;
    }
    
    public boolean hasAssistType()
    {
	return componentIsPresent(20);
    }
    
    public void deleteAssistType()
    {
	setComponentAbsent(20);
    }
    
    
    // Methods for field "sizing"
    public UserSizeAndBehaviour getSizing()
    {
	return (UserSizeAndBehaviour)mComponents[21];
    }
    
    public void setSizing(UserSizeAndBehaviour sizing)
    {
	mComponents[21] = sizing;
    }
    
    public boolean hasSizing()
    {
	return componentIsPresent(21);
    }
    
    public void deleteSizing()
    {
	setComponentAbsent(21);
    }
    
    
    // Methods for field "attachment"
    public Attachment getAttachment()
    {
	return (Attachment)mComponents[22];
    }
    
    public void setAttachment(Attachment attachment)
    {
	mComponents[22] = attachment;
    }
    
    public boolean hasAttachment()
    {
	return componentIsPresent(22);
    }
    
    public void deleteAttachment()
    {
	setComponentAbsent(22);
    }
    
    
    // Methods for field "attachmentRadius"
    public AttachmentRadius getAttachmentRadius()
    {
	return (AttachmentRadius)mComponents[23];
    }
    
    public void setAttachmentRadius(AttachmentRadius attachmentRadius)
    {
	mComponents[23] = attachmentRadius;
    }
    
    public boolean hasAttachmentRadius()
    {
	return componentIsPresent(23);
    }
    
    public void deleteAttachmentRadius()
    {
	setComponentAbsent(23);
    }
    
    
    // Methods for field "animalType"
    public AnimalType getAnimalType()
    {
	return (AnimalType)mComponents[24];
    }
    
    public void setAnimalType(AnimalType animalType)
    {
	mComponents[24] = animalType;
    }
    
    public boolean hasAnimalType()
    {
	return componentIsPresent(24);
    }
    
    public void deleteAnimalType()
    {
	setComponentAbsent(24);
    }
    
    
    // Methods for field "regional"
    public Regional getRegional()
    {
	return (Regional)mComponents[25];
    }
    
    public void setRegional(Regional regional)
    {
	mComponents[25] = regional;
    }
    
    public boolean hasRegional()
    {
	return componentIsPresent(25);
    }
    
    public void deleteRegional()
    {
	setComponentAbsent(25);
    }
    
    
    
    /**
     * Define the ASN1 Type Regional from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class Regional extends SequenceOf<Regional.Sequence_> {
	
	/**
	 * The default constructor.
	 */
	public Regional()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Regional(Sequence_[] elements)
	{
	    super(elements);
	}
	
	
	/**
	 * Define the ASN1 Type Sequence_ from ASN1 Module DSRC.
	 * @see Sequence
	 */
	public static class Sequence_ extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Sequence_()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Sequence_(RegionId regionId, OpenType regExtValue)
	    {
		setRegionId(regionId);
		setRegExtValue(regExtValue);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new RegionId();
		mComponents[1] = new OpenType();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[2];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new RegionId();
		    case 1:
			return new OpenType();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "regionId"
	    public RegionId getRegionId()
	    {
		return (RegionId)mComponents[0];
	    }
	    
	    public void setRegionId(RegionId regionId)
	    {
		mComponents[0] = regionId;
	    }
	    
	    
	    // Methods for field "regExtValue"
	    public OpenType getRegExtValue()
	    {
		return (OpenType)mComponents[1];
	    }
	    
	    public void setRegExtValue(OpenType regExtValue)
	    {
		mComponents[1] = regExtValue;
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
		    "PersonalSafetyMessage$Regional$Sequence_"
		),
		new QName (
		    "builtin",
		    "SEQUENCE"
		),
		274962,
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
					"RegionId"
				    ),
				    new QName (
					"DSRC",
					"RegionId"
				    ),
				    274450,
				    new Intersection (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new RegionId(0), 
						new RegionId(255),
						0
					    )
					),
					new TableConstraint (
					    dsrc.region.REGION.reg_PersonalSafetyMessage,
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
			    "regionId",
			    0,
			    274,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new OpenTypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"com.oss.asn1",
					"OpenType"
				    ),
				    new QName (
					"builtin",
					"OpenType"
				    ),
				    1323026,
				    new ComponentRelationConstraint (
					new TableConstraint (
					    dsrc.region.REGION.reg_PersonalSafetyMessage,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "PersonalSafetyMessage$Regional$Sequence_"
							),
							0
						    ),
						    0
						)
					    }
					)
				    ),
				    new ComponentRelationConstraint (
					new TableConstraint (
					    dsrc.region.REGION.reg_PersonalSafetyMessage,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "PersonalSafetyMessage$Regional$Sequence_"
							),
							0
						    ),
						    0
						)
					    }
					)
				    )
				)
			    ),
			    "regExtValue",
			    1,
			    2,
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
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Sequence_ object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Sequence_ object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Sequence_

	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Sequence_();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8019
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"PersonalSafetyMessage$Regional"
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
			new INTEGER(4),
			0
		    )
		)
	    ),
	    new Bounds (
		Long.valueOf(1),
		Long.valueOf(4)
	    ),
	    new TypeInfoRef (
		new QName (
		    "dsrc.dsrc",
		    "PersonalSafetyMessage$Regional$Sequence_"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Regional object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Regional object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Regional

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
	    "PersonalSafetyMessage"
	),
	new QName (
	    "DSRC",
	    "PersonalSafetyMessage"
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
				"dsrc.dsrc",
				"PersonalDeviceUserType"
			    ),
			    new QName (
				"DSRC",
				"PersonalDeviceUserType"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"aPEDESTRIAN",
					1
				    ),
				    new MemberListElement (
					"aPEDALCYCLIST",
					2
				    ),
				    new MemberListElement (
					"aPUBLICSAFETYWORKER",
					3
				    ),
				    new MemberListElement (
					"anANIMAL",
					4
				    )
				}
			    ),
			    0,
			    PersonalDeviceUserType.unavailable
			)
		    ),
		    "basicType",
		    0,
		    2,
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
				"DSecond"
			    ),
			    new QName (
				"DSRC",
				"DSecond"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DSecond(0), 
				    new DSecond(65535),
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
		    "secMark",
		    1,
		    2,
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
				"MsgCount"
			    ),
			    new QName (
				"DSRC",
				"MsgCount"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MsgCount(0), 
				    new MsgCount(127),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(127)
			    ),
			    null
			)
		    ),
		    "msgCnt",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "id",
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
				"Position3D"
			    ),
			    new QName (
				"DSRC",
				"Position3D"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Position3D"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Position3D"
				)
			    ),
			    0
			)
		    ),
		    "position",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"PositionalAccuracy"
			    ),
			    new QName (
				"DSRC",
				"PositionalAccuracy"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "PositionalAccuracy"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "PositionalAccuracy"
				)
			    ),
			    0
			)
		    ),
		    "accuracy",
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
				"Velocity"
			    ),
			    new QName (
				"DSRC",
				"Velocity"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Velocity(0), 
				    new Velocity(8191),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(8191)
			    ),
			    null
			)
		    ),
		    "speed",
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
				"Heading"
			    ),
			    new QName (
				"DSRC",
				"Heading"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Heading(0), 
				    new Heading(28800),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(28800)
			    ),
			    null
			)
		    ),
		    "heading",
		    7,
		    2,
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
				"AccelerationSet4Way"
			    ),
			    new QName (
				"DSRC",
				"AccelerationSet4Way"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "AccelerationSet4Way"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "AccelerationSet4Way"
				)
			    ),
			    0
			)
		    ),
		    "accelSet",
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
				"PathHistory"
			    ),
			    new QName (
				"DSRC",
				"PathHistory"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "PathHistory"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "PathHistory"
				)
			    ),
			    0
			)
		    ),
		    "pathHistory",
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
				"dsrc.dsrc",
				"PathPrediction"
			    ),
			    new QName (
				"DSRC",
				"PathPrediction"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "PathPrediction"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "PathPrediction"
				)
			    ),
			    0
			)
		    ),
		    "pathPrediction",
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"PropelledInformation"
			    ),
			    new QName (
				"DSRC",
				"PropelledInformation"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "PropelledInformation"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "propulsion",
		    11,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"PersonalDeviceUsageState"
			    ),
			    new QName (
				"DSRC",
				"PersonalDeviceUsageState"
			    ),
			    274454,
			    new SizeConstraint (
				new ExtensibleConstraint (
				    new SingleValueConstraint (
					new INTEGER(9)
				    ),
				    null
				)
			    ),
			    new Bounds (
				Long.valueOf(9),
				Long.valueOf(9)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"other",
					1
				    ),
				    new MemberListElement (
					"idle",
					2
				    ),
				    new MemberListElement (
					"listeningToAudio",
					3
				    ),
				    new MemberListElement (
					"typing",
					4
				    ),
				    new MemberListElement (
					"calling",
					5
				    ),
				    new MemberListElement (
					"playingGames",
					6
				    ),
				    new MemberListElement (
					"reading",
					7
				    ),
				    new MemberListElement (
					"viewing",
					8
				    )
				}
			    )
			)
		    ),
		    "useState",
		    12,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"PersonalCrossingRequest"
			    ),
			    new QName (
				"DSRC",
				"PersonalCrossingRequest"
			    ),
			    274450,
			    null
			)
		    ),
		    "crossRequest",
		    13,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"PersonalCrossingInProgress"
			    ),
			    new QName (
				"DSRC",
				"PersonalCrossingInProgress"
			    ),
			    274450,
			    null
			)
		    ),
		    "crossState",
		    14,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"NumberOfParticipantsInCluster"
			    ),
			    new QName (
				"DSRC",
				"NumberOfParticipantsInCluster"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"small",
					1
				    ),
				    new MemberListElement (
					"medium",
					2
				    ),
				    new MemberListElement (
					"large",
					3
				    )
				}
			    ),
			    0,
			    NumberOfParticipantsInCluster.unavailable
			)
		    ),
		    "clusterSize",
		    15,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"PersonalClusterRadius"
			    ),
			    new QName (
				"DSRC",
				"PersonalClusterRadius"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PersonalClusterRadius(0), 
				    new PersonalClusterRadius(100),
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
		    "clusterRadius",
		    16,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8011
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"PublicSafetyEventResponderWorkerType"
			    ),
			    new QName (
				"DSRC",
				"PublicSafetyEventResponderWorkerType"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"towOperater",
					1
				    ),
				    new MemberListElement (
					"fireAndEMSWorker",
					2
				    ),
				    new MemberListElement (
					"aDOTWorker",
					3
				    ),
				    new MemberListElement (
					"lawEnforcement",
					4
				    ),
				    new MemberListElement (
					"hazmatResponder",
					5
				    ),
				    new MemberListElement (
					"animalControlWorker",
					6
				    ),
				    new MemberListElement (
					"otherPersonnel",
					7
				    )
				}
			    ),
			    0,
			    PublicSafetyEventResponderWorkerType.unavailable
			)
		    ),
		    "eventResponderType",
		    17,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8012
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"PublicSafetyAndRoadWorkerActivity"
			    ),
			    new QName (
				"DSRC",
				"PublicSafetyAndRoadWorkerActivity"
			    ),
			    274454,
			    new SizeConstraint (
				new ExtensibleConstraint (
				    new SingleValueConstraint (
					new INTEGER(6)
				    ),
				    null
				)
			    ),
			    new Bounds (
				Long.valueOf(6),
				Long.valueOf(6)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"workingOnRoad",
					1
				    ),
				    new MemberListElement (
					"settingUpClosures",
					2
				    ),
				    new MemberListElement (
					"respondingToEvents",
					3
				    ),
				    new MemberListElement (
					"directingTraffic",
					4
				    ),
				    new MemberListElement (
					"otherActivities",
					5
				    )
				}
			    )
			)
		    ),
		    "activityType",
		    18,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8013
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"PublicSafetyDirectingTrafficSubType"
			    ),
			    new QName (
				"DSRC",
				"PublicSafetyDirectingTrafficSubType"
			    ),
			    274454,
			    new SizeConstraint (
				new ExtensibleConstraint (
				    new SingleValueConstraint (
					new INTEGER(7)
				    ),
				    null
				)
			    ),
			    new Bounds (
				Long.valueOf(7),
				Long.valueOf(7)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"policeAndTrafficOfficers",
					1
				    ),
				    new MemberListElement (
					"trafficControlPersons",
					2
				    ),
				    new MemberListElement (
					"railroadCrossingGuards",
					3
				    ),
				    new MemberListElement (
					"civilDefenseNationalGuardMilitaryPolice",
					4
				    ),
				    new MemberListElement (
					"emergencyOrganizationPersonnel",
					5
				    ),
				    new MemberListElement (
					"highwayServiceVehiclePersonnel",
					6
				    )
				}
			    )
			)
		    ),
		    "activitySubType",
		    19,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8014
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"PersonalAssistive"
			    ),
			    new QName (
				"DSRC",
				"PersonalAssistive"
			    ),
			    274454,
			    new SizeConstraint (
				new ExtensibleConstraint (
				    new SingleValueConstraint (
					new INTEGER(6)
				    ),
				    null
				)
			    ),
			    new Bounds (
				Long.valueOf(6),
				Long.valueOf(6)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"otherType",
					1
				    ),
				    new MemberListElement (
					"vision",
					2
				    ),
				    new MemberListElement (
					"hearing",
					3
				    ),
				    new MemberListElement (
					"movement",
					4
				    ),
				    new MemberListElement (
					"cognition",
					5
				    )
				}
			    )
			)
		    ),
		    "assistType",
		    20,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8015
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"UserSizeAndBehaviour"
			    ),
			    new QName (
				"DSRC",
				"UserSizeAndBehaviour"
			    ),
			    274454,
			    new SizeConstraint (
				new ExtensibleConstraint (
				    new SingleValueConstraint (
					new INTEGER(5)
				    ),
				    null
				)
			    ),
			    new Bounds (
				Long.valueOf(5),
				Long.valueOf(5)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"smallStature",
					1
				    ),
				    new MemberListElement (
					"largeStature",
					2
				    ),
				    new MemberListElement (
					"erraticMoving",
					3
				    ),
				    new MemberListElement (
					"slowMoving",
					4
				    )
				}
			    )
			)
		    ),
		    "sizing",
		    21,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8016
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Attachment"
			    ),
			    new QName (
				"DSRC",
				"Attachment"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"stroller",
					1
				    ),
				    new MemberListElement (
					"bicycleTrailer",
					2
				    ),
				    new MemberListElement (
					"cart",
					3
				    ),
				    new MemberListElement (
					"wheelchair",
					4
				    ),
				    new MemberListElement (
					"otherWalkAssistAttachments",
					5
				    ),
				    new MemberListElement (
					"pet",
					6
				    )
				}
			    ),
			    0,
			    Attachment.unavailable
			)
		    ),
		    "attachment",
		    22,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8017
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"AttachmentRadius"
			    ),
			    new QName (
				"DSRC",
				"AttachmentRadius"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new AttachmentRadius(0), 
				    new AttachmentRadius(200),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(200)
			    ),
			    null
			)
		    ),
		    "attachmentRadius",
		    23,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8018
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"AnimalType"
			    ),
			    new QName (
				"DSRC",
				"AnimalType"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"serviceUse",
					1
				    ),
				    new MemberListElement (
					"pet",
					2
				    ),
				    new MemberListElement (
					"farm",
					3
				    )
				}
			    ),
			    0,
			    AnimalType.unavailable
			)
		    ),
		    "animalType",
		    24,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "PersonalSafetyMessage$Regional"
			)
		    ),
		    "regional",
		    25,
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
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25)
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
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25)
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
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25)
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
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8019, 25)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PersonalSafetyMessage object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PersonalSafetyMessage object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PersonalSafetyMessage
