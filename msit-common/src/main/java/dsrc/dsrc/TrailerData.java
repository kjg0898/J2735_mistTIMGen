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
 * Define the ASN1 Type TrailerData from ASN1 Module DSRC.
 * @see Sequence
 */

public class TrailerData extends Sequence {
    
    /**
     * The default constructor.
     */
    public TrailerData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TrailerData(SSPindex sspRights, PivotPointDescription connection, 
		    TrailerUnitDescriptionList units)
    {
	setSspRights(sspRights);
	setConnection(connection);
	setUnits(units);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SSPindex();
	mComponents[1] = new PivotPointDescription();
	mComponents[2] = new TrailerUnitDescriptionList();
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
		return new SSPindex();
	    case 1:
		return new PivotPointDescription();
	    case 2:
		return new TrailerUnitDescriptionList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sspRights"
    public SSPindex getSspRights()
    {
	return (SSPindex)mComponents[0];
    }
    
    public void setSspRights(SSPindex sspRights)
    {
	mComponents[0] = sspRights;
    }
    
    
    // Methods for field "connection"
    public PivotPointDescription getConnection()
    {
	return (PivotPointDescription)mComponents[1];
    }
    
    public void setConnection(PivotPointDescription connection)
    {
	mComponents[1] = connection;
    }
    
    
    // Methods for field "units"
    public TrailerUnitDescriptionList getUnits()
    {
	return (TrailerUnitDescriptionList)mComponents[2];
    }
    
    public void setUnits(TrailerUnitDescriptionList units)
    {
	mComponents[2] = units;
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
	    "TrailerData"
	),
	new QName (
	    "DSRC",
	    "TrailerData"
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
		    "sspRights",
		    0,
		    2,
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
				"PivotPointDescription"
			    ),
			    new QName (
				"DSRC",
				"PivotPointDescription"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "PivotPointDescription"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "PivotPointDescription"
				)
			    ),
			    0
			)
		    ),
		    "connection",
		    1,
		    2,
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
				"TrailerUnitDescriptionList"
			    ),
			    new QName (
				"DSRC",
				"TrailerUnitDescriptionList"
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
				    "dsrc.dsrc",
				    "TrailerUnitDescription"
				)
			    )
			)
		    ),
		    "units",
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TrailerData object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TrailerData object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TrailerData
