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
 * Define the ASN1 Type ProbeDataManagement from ASN1 Module DSRC.
 * @see Sequence
 */

public class ProbeDataManagement extends Sequence {
    
    /**
     * The default constructor.
     */
    public ProbeDataManagement()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ProbeDataManagement(MinuteOfTheYear timeStamp, Sample sample, 
		    HeadingSlice directions, Term term, Snapshot snapshot, 
		    SecondOfTime txInterval, 
		    VehicleStatusRequestList dataElements, Regional regional)
    {
	setTimeStamp(timeStamp);
	setSample(sample);
	setDirections(directions);
	setTerm(term);
	setSnapshot(snapshot);
	setTxInterval(txInterval);
	setDataElements(dataElements);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public ProbeDataManagement(Sample sample, HeadingSlice directions, 
		    Term term, Snapshot snapshot, SecondOfTime txInterval)
    {
	setSample(sample);
	setDirections(directions);
	setTerm(term);
	setSnapshot(snapshot);
	setTxInterval(txInterval);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MinuteOfTheYear();
	mComponents[1] = new Sample();
	mComponents[2] = new HeadingSlice();
	mComponents[3] = new Term();
	mComponents[4] = new Snapshot();
	mComponents[5] = new SecondOfTime();
	mComponents[6] = new VehicleStatusRequestList();
	mComponents[7] = new Regional();
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
		return new MinuteOfTheYear();
	    case 1:
		return new Sample();
	    case 2:
		return new HeadingSlice();
	    case 3:
		return new Term();
	    case 4:
		return new Snapshot();
	    case 5:
		return new SecondOfTime();
	    case 6:
		return new VehicleStatusRequestList();
	    case 7:
		return new Regional();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "timeStamp"
    public MinuteOfTheYear getTimeStamp()
    {
	return (MinuteOfTheYear)mComponents[0];
    }
    
    public void setTimeStamp(MinuteOfTheYear timeStamp)
    {
	mComponents[0] = timeStamp;
    }
    
    public boolean hasTimeStamp()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTimeStamp()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "sample"
    public Sample getSample()
    {
	return (Sample)mComponents[1];
    }
    
    public void setSample(Sample sample)
    {
	mComponents[1] = sample;
    }
    
    
    // Methods for field "directions"
    public HeadingSlice getDirections()
    {
	return (HeadingSlice)mComponents[2];
    }
    
    public void setDirections(HeadingSlice directions)
    {
	mComponents[2] = directions;
    }
    
    
    // Methods for field "term"
    public Term getTerm()
    {
	return (Term)mComponents[3];
    }
    
    public void setTerm(Term term)
    {
	mComponents[3] = term;
    }
    
    
    
    /**
     * Define the ASN1 Type Term from ASN1 Module DSRC.
     * @see Choice
     */
    public static class Term extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Term()
	{
	}
	
	public static final  int  termtime_chosen = 1;
	public static final  int  termDistance_chosen = 2;
	
	// Methods for field "termtime"
	public static Term createTermWithTermtime(long termtime)
	{
	    return createTermWithTermtime(new TermTime(termtime));
	}
	
	public static Term createTermWithTermtime(TermTime termtime)
	{
	    Term __object = new Term();

	    __object.setTermtime(termtime);
	    return __object;
	}
	
	public boolean hasTermtime()
	{
	    return getChosenFlag() == termtime_chosen;
	}
	
	public TermTime getTermtime()
	{
	    if (hasTermtime())
		return (TermTime)mChosenValue;
	    else
		return null;
	}
	
	public void setTermtime(long termtime)
	{
	    setTermtime(new TermTime(termtime));
	}
	
	public void setTermtime(TermTime termtime)
	{
	    setChosenValue(termtime);
	    setChosenFlag(termtime_chosen);
	}
	
	
	// Methods for field "termDistance"
	public static Term createTermWithTermDistance(long termDistance)
	{
	    return createTermWithTermDistance(new TermDistance(termDistance));
	}
	
	public static Term createTermWithTermDistance(TermDistance termDistance)
	{
	    Term __object = new Term();

	    __object.setTermDistance(termDistance);
	    return __object;
	}
	
	public boolean hasTermDistance()
	{
	    return getChosenFlag() == termDistance_chosen;
	}
	
	public TermDistance getTermDistance()
	{
	    if (hasTermDistance())
		return (TermDistance)mChosenValue;
	    else
		return null;
	}
	
	public void setTermDistance(long termDistance)
	{
	    setTermDistance(new TermDistance(termDistance));
	}
	
	public void setTermDistance(TermDistance termDistance)
	{
	    setChosenValue(termDistance);
	    setChosenFlag(termDistance_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case termtime_chosen:
		    return new TermTime();
		case termDistance_chosen:
		    return new TermDistance();
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"ProbeDataManagement$Term"
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
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "TermTime"
				),
				new QName (
				    "DSRC",
				    "TermTime"
				),
				274450,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new TermTime(1), 
					new TermTime(1800),
					0
				    )
				),
				new Bounds (
				    Long.valueOf(1),
				    Long.valueOf(1800)
				),
				null
			    )
			),
			"termtime",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "TermDistance"
				),
				new QName (
				    "DSRC",
				    "TermDistance"
				),
				274450,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new TermDistance(1), 
					new TermDistance(30000),
					0
				    )
				),
				new Bounds (
				    Long.valueOf(1),
				    Long.valueOf(30000)
				),
				null
			    )
			),
			"termDistance",
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
	 * Get the type descriptor (TypeInfo) of 'this' Term object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Term object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Term

    // Methods for field "snapshot"
    public Snapshot getSnapshot()
    {
	return (Snapshot)mComponents[4];
    }
    
    public void setSnapshot(Snapshot snapshot)
    {
	mComponents[4] = snapshot;
    }
    
    
    
    /**
     * Define the ASN1 Type Snapshot from ASN1 Module DSRC.
     * @see Choice
     */
    public static class Snapshot extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Snapshot()
	{
	}
	
	public static final  int  snapshotTime_chosen = 1;
	public static final  int  snapshotDistance_chosen = 2;
	
	// Methods for field "snapshotTime"
	public static Snapshot createSnapshotWithSnapshotTime(SnapshotTime snapshotTime)
	{
	    Snapshot __object = new Snapshot();

	    __object.setSnapshotTime(snapshotTime);
	    return __object;
	}
	
	public boolean hasSnapshotTime()
	{
	    return getChosenFlag() == snapshotTime_chosen;
	}
	
	public SnapshotTime getSnapshotTime()
	{
	    if (hasSnapshotTime())
		return (SnapshotTime)mChosenValue;
	    else
		return null;
	}
	
	public void setSnapshotTime(SnapshotTime snapshotTime)
	{
	    setChosenValue(snapshotTime);
	    setChosenFlag(snapshotTime_chosen);
	}
	
	
	// Methods for field "snapshotDistance"
	public static Snapshot createSnapshotWithSnapshotDistance(SnapshotDistance snapshotDistance)
	{
	    Snapshot __object = new Snapshot();

	    __object.setSnapshotDistance(snapshotDistance);
	    return __object;
	}
	
	public boolean hasSnapshotDistance()
	{
	    return getChosenFlag() == snapshotDistance_chosen;
	}
	
	public SnapshotDistance getSnapshotDistance()
	{
	    if (hasSnapshotDistance())
		return (SnapshotDistance)mChosenValue;
	    else
		return null;
	}
	
	public void setSnapshotDistance(SnapshotDistance snapshotDistance)
	{
	    setChosenValue(snapshotDistance);
	    setChosenFlag(snapshotDistance_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case snapshotTime_chosen:
		    return new SnapshotTime();
		case snapshotDistance_chosen:
		    return new SnapshotDistance();
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
		    (short)0x8004
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"ProbeDataManagement$Snapshot"
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
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "SnapshotTime"
				),
				new QName (
				    "DSRC",
				    "SnapshotTime"
				),
				274450,
				null,
				new FieldsRef (
				    new QName (
					"dsrc.dsrc",
					"SnapshotTime"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"dsrc.dsrc",
					"SnapshotTime"
				    )
				),
				0
			    )
			),
			"snapshotTime",
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
				    "SnapshotDistance"
				),
				new QName (
				    "DSRC",
				    "SnapshotDistance"
				),
				274450,
				null,
				new FieldsRef (
				    new QName (
					"dsrc.dsrc",
					"SnapshotDistance"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"dsrc.dsrc",
					"SnapshotDistance"
				    )
				),
				0
			    )
			),
			"snapshotDistance",
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
	 * Get the type descriptor (TypeInfo) of 'this' Snapshot object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Snapshot object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Snapshot

    // Methods for field "txInterval"
    public SecondOfTime getTxInterval()
    {
	return (SecondOfTime)mComponents[5];
    }
    
    public void setTxInterval(SecondOfTime txInterval)
    {
	mComponents[5] = txInterval;
    }
    
    
    // Methods for field "dataElements"
    public VehicleStatusRequestList getDataElements()
    {
	return (VehicleStatusRequestList)mComponents[6];
    }
    
    public void setDataElements(VehicleStatusRequestList dataElements)
    {
	mComponents[6] = dataElements;
    }
    
    public boolean hasDataElements()
    {
	return componentIsPresent(6);
    }
    
    public void deleteDataElements()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "regional"
    public Regional getRegional()
    {
	return (Regional)mComponents[7];
    }
    
    public void setRegional(Regional regional)
    {
	mComponents[7] = regional;
    }
    
    public boolean hasRegional()
    {
	return componentIsPresent(7);
    }
    
    public void deleteRegional()
    {
	setComponentAbsent(7);
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
		    "ProbeDataManagement$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_ProbeDataManagement,
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
					    dsrc.region.REGION.reg_ProbeDataManagement,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "ProbeDataManagement$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_ProbeDataManagement,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "ProbeDataManagement$Regional$Sequence_"
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
		    (short)0x8007
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"ProbeDataManagement$Regional"
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
		    "ProbeDataManagement$Regional$Sequence_"
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
	    "ProbeDataManagement"
	),
	new QName (
	    "DSRC",
	    "ProbeDataManagement"
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
		    "timeStamp",
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
				"Sample"
			    ),
			    new QName (
				"DSRC",
				"Sample"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Sample"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Sample"
				)
			    ),
			    0
			)
		    ),
		    "sample",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"HeadingSlice"
			    ),
			    new QName (
				"DSRC",
				"HeadingSlice"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(16)
				)
			    ),
			    new Bounds (
				Long.valueOf(16),
				Long.valueOf(16)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"from000-0to022-5degrees",
					0
				    ),
				    new MemberListElement (
					"from022-5to045-0degrees",
					1
				    ),
				    new MemberListElement (
					"from045-0to067-5degrees",
					2
				    ),
				    new MemberListElement (
					"from067-5to090-0degrees",
					3
				    ),
				    new MemberListElement (
					"from090-0to112-5degrees",
					4
				    ),
				    new MemberListElement (
					"from112-5to135-0degrees",
					5
				    ),
				    new MemberListElement (
					"from135-0to157-5degrees",
					6
				    ),
				    new MemberListElement (
					"from157-5to180-0degrees",
					7
				    ),
				    new MemberListElement (
					"from180-0to202-5degrees",
					8
				    ),
				    new MemberListElement (
					"from202-5to225-0degrees",
					9
				    ),
				    new MemberListElement (
					"from225-0to247-5degrees",
					10
				    ),
				    new MemberListElement (
					"from247-5to270-0degrees",
					11
				    ),
				    new MemberListElement (
					"from270-0to292-5degrees",
					12
				    ),
				    new MemberListElement (
					"from292-5to315-0degrees",
					13
				    ),
				    new MemberListElement (
					"from315-0to337-5degrees",
					14
				    ),
				    new MemberListElement (
					"from337-5to360-0degrees",
					15
				    )
				}
			    )
			)
		    ),
		    "directions",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "ProbeDataManagement$Term"
			)
		    ),
		    "term",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "ProbeDataManagement$Snapshot"
			)
		    ),
		    "snapshot",
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
				"SecondOfTime"
			    ),
			    new QName (
				"DSRC",
				"SecondOfTime"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SecondOfTime(0), 
				    new SecondOfTime(61),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(61)
			    ),
			    null
			)
		    ),
		    "txInterval",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"VehicleStatusRequestList"
			    ),
			    new QName (
				"DSRC",
				"VehicleStatusRequestList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "VehicleStatusRequest"
				)
			    )
			)
		    ),
		    "dataElements",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "ProbeDataManagement$Regional"
			)
		    ),
		    "regional",
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
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' ProbeDataManagement object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ProbeDataManagement object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ProbeDataManagement
