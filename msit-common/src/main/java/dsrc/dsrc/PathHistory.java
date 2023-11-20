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
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type PathHistory from ASN1 Module DSRC.
 * @see Sequence
 */

public class PathHistory extends Sequence {
    
    /**
     * The default constructor.
     */
    public PathHistory()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PathHistory(FullPositionVector initialPosition, 
		    GNSSstatus currGNSSstatus, PathHistoryPointList crumbData)
    {
	setInitialPosition(initialPosition);
	setCurrGNSSstatus(currGNSSstatus);
	setCrumbData(crumbData);
    }
    
    /**
     * Construct with required components.
     */
    public PathHistory(PathHistoryPointList crumbData)
    {
	setCrumbData(crumbData);
    }
    
    public void initComponents()
    {
	mComponents[0] = new FullPositionVector();
	mComponents[1] = new GNSSstatus();
	mComponents[2] = new PathHistoryPointList();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new FullPositionVector();
	    case 1:
		return new GNSSstatus();
	    case 2:
		return new PathHistoryPointList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "initialPosition"
    public FullPositionVector getInitialPosition()
    {
	return (FullPositionVector)mComponents[0];
    }
    
    public void setInitialPosition(FullPositionVector initialPosition)
    {
	mComponents[0] = initialPosition;
    }
    
    public boolean hasInitialPosition()
    {
	return componentIsPresent(0);
    }
    
    public void deleteInitialPosition()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "currGNSSstatus"
    public GNSSstatus getCurrGNSSstatus()
    {
	return (GNSSstatus)mComponents[1];
    }
    
    public void setCurrGNSSstatus(GNSSstatus currGNSSstatus)
    {
	mComponents[1] = currGNSSstatus;
    }
    
    public boolean hasCurrGNSSstatus()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCurrGNSSstatus()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "crumbData"
    public PathHistoryPointList getCrumbData()
    {
	return (PathHistoryPointList)mComponents[2];
    }
    
    public void setCrumbData(PathHistoryPointList crumbData)
    {
	mComponents[2] = crumbData;
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
	    "PathHistory"
	),
	new QName (
	    "DSRC",
	    "PathHistory"
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
				"dsrc.dsrc",
				"FullPositionVector"
			    ),
			    new QName (
				"DSRC",
				"FullPositionVector"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "FullPositionVector"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "FullPositionVector"
				)
			    ),
			    0
			)
		    ),
		    "initialPosition",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"GNSSstatus"
			    ),
			    new QName (
				"DSRC",
				"GNSSstatus"
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
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"isHealthy",
					1
				    ),
				    new MemberListElement (
					"isMonitored",
					2
				    ),
				    new MemberListElement (
					"baseStationType",
					3
				    ),
				    new MemberListElement (
					"aPDOPofUnder5",
					4
				    ),
				    new MemberListElement (
					"inViewOfUnder5",
					5
				    ),
				    new MemberListElement (
					"localCorrectionsPresent",
					6
				    ),
				    new MemberListElement (
					"networkCorrectionsPresent",
					7
				    )
				}
			    )
			)
		    ),
		    "currGNSSstatus",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"PathHistoryPointList"
			    ),
			    new QName (
				"DSRC",
				"PathHistoryPointList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(23),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(23)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "PathHistoryPoint"
				)
			    )
			)
		    ),
		    "crumbData",
		    2,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PathHistory object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PathHistory object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PathHistory
