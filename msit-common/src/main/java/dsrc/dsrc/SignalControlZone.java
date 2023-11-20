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
import com.oss.asn1.OpenType;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type SignalControlZone from ASN1 Module DSRC.
 * @see Sequence
 */

public class SignalControlZone extends Sequence {
    
    /**
     * The default constructor.
     */
    public SignalControlZone()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SignalControlZone(Zone zone)
    {
	setZone(zone);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Zone();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new Zone();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "zone"
    public Zone getZone()
    {
	return (Zone)mComponents[0];
    }
    
    public void setZone(Zone zone)
    {
	mComponents[0] = zone;
    }
    
    
    
    /**
     * Define the ASN1 Type Zone from ASN1 Module DSRC.
     * @see Sequence
     */
    public static class Zone extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Zone()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Zone(RegionId regionId, OpenType regExtValue)
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"SignalControlZone$Zone"
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
					dsrc.region.REGION.reg_SignalControlZone,
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
					dsrc.region.REGION.reg_SignalControlZone,
					1
				    ),
				    new ComponentRelations (
					new ComponentRelation[] {
					    new ComponentRelation (
						0,
						new FieldInfoRef (
						    new QName (
							"dsrc.dsrc",
							"SignalControlZone$Zone"
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
					dsrc.region.REGION.reg_SignalControlZone,
					1
				    ),
				    new ComponentRelations (
					new ComponentRelation[] {
					    new ComponentRelation (
						0,
						new FieldInfoRef (
						    new QName (
							"dsrc.dsrc",
							"SignalControlZone$Zone"
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
	 * Get the type descriptor (TypeInfo) of 'this' Zone object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Zone object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Zone

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
	    "SignalControlZone"
	),
	new QName (
	    "DSRC",
	    "SignalControlZone"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "SignalControlZone$Zone"
			)
		    ),
		    "zone",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SignalControlZone object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SignalControlZone object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SignalControlZone
