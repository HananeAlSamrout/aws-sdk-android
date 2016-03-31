/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the properties of a local secondary index.
 * </p>
 */
public class LocalSecondaryIndexDescription implements Serializable {

    /**
     * Represents the name of the local secondary index.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String indexName;

    /**
     * The complete key schema for the local secondary index, consisting of
     * one or more pairs of attribute names and key types: <ul>
     * <li><p><code>HASH</code> - partition key </li>
     * <li><p><code>RANGE</code> - sort key</li> </ul> <note> <p>The
     * partition key of an item is also known as its <i>hash attribute</i>.
     * The term "hash attribute" derives from DynamoDB' usage of an internal
     * hash function to evenly distribute data items across partitions, based
     * on their partition key values. <p>The sort key of an item is also
     * known as its <i>range attribute</i>. The term "range attribute"
     * derives from the way DynamoDB stores items with the same partition key
     * physically close together, in sorted order by the sort key
     * value.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement> keySchema;

    /**
     * Represents attributes that are copied (projected) from the table into
     * an index. These are in addition to the primary key attributes and
     * index key attributes, which are automatically projected.
     */
    private Projection projection;

    /**
     * The total size of the specified index, in bytes. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     */
    private Long indexSizeBytes;

    /**
     * The number of items in the specified index. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     */
    private Long itemCount;

    /**
     * The Amazon Resource Name (ARN) that uniquely identifies the index.
     */
    private String indexArn;

    /**
     * Represents the name of the local secondary index.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return Represents the name of the local secondary index.
     */
    public String getIndexName() {
        return indexName;
    }
    
    /**
     * Represents the name of the local secondary index.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName Represents the name of the local secondary index.
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }
    
    /**
     * Represents the name of the local secondary index.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName Represents the name of the local secondary index.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LocalSecondaryIndexDescription withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * The complete key schema for the local secondary index, consisting of
     * one or more pairs of attribute names and key types: <ul>
     * <li><p><code>HASH</code> - partition key </li>
     * <li><p><code>RANGE</code> - sort key</li> </ul> <note> <p>The
     * partition key of an item is also known as its <i>hash attribute</i>.
     * The term "hash attribute" derives from DynamoDB' usage of an internal
     * hash function to evenly distribute data items across partitions, based
     * on their partition key values. <p>The sort key of an item is also
     * known as its <i>range attribute</i>. The term "range attribute"
     * derives from the way DynamoDB stores items with the same partition key
     * physically close together, in sorted order by the sort key
     * value.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @return The complete key schema for the local secondary index, consisting of
     *         one or more pairs of attribute names and key types: <ul>
     *         <li><p><code>HASH</code> - partition key </li>
     *         <li><p><code>RANGE</code> - sort key</li> </ul> <note> <p>The
     *         partition key of an item is also known as its <i>hash attribute</i>.
     *         The term "hash attribute" derives from DynamoDB' usage of an internal
     *         hash function to evenly distribute data items across partitions, based
     *         on their partition key values. <p>The sort key of an item is also
     *         known as its <i>range attribute</i>. The term "range attribute"
     *         derives from the way DynamoDB stores items with the same partition key
     *         physically close together, in sorted order by the sort key
     *         value.</note>
     */
    public java.util.List<KeySchemaElement> getKeySchema() {
        return keySchema;
    }
    
    /**
     * The complete key schema for the local secondary index, consisting of
     * one or more pairs of attribute names and key types: <ul>
     * <li><p><code>HASH</code> - partition key </li>
     * <li><p><code>RANGE</code> - sort key</li> </ul> <note> <p>The
     * partition key of an item is also known as its <i>hash attribute</i>.
     * The term "hash attribute" derives from DynamoDB' usage of an internal
     * hash function to evenly distribute data items across partitions, based
     * on their partition key values. <p>The sort key of an item is also
     * known as its <i>range attribute</i>. The term "range attribute"
     * derives from the way DynamoDB stores items with the same partition key
     * physically close together, in sorted order by the sort key
     * value.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param keySchema The complete key schema for the local secondary index, consisting of
     *         one or more pairs of attribute names and key types: <ul>
     *         <li><p><code>HASH</code> - partition key </li>
     *         <li><p><code>RANGE</code> - sort key</li> </ul> <note> <p>The
     *         partition key of an item is also known as its <i>hash attribute</i>.
     *         The term "hash attribute" derives from DynamoDB' usage of an internal
     *         hash function to evenly distribute data items across partitions, based
     *         on their partition key values. <p>The sort key of an item is also
     *         known as its <i>range attribute</i>. The term "range attribute"
     *         derives from the way DynamoDB stores items with the same partition key
     *         physically close together, in sorted order by the sort key
     *         value.</note>
     */
    public void setKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        if (keySchema == null) {
            this.keySchema = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement> keySchemaCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement>(keySchema.size());
        keySchemaCopy.addAll(keySchema);
        this.keySchema = keySchemaCopy;
    }
    
    /**
     * The complete key schema for the local secondary index, consisting of
     * one or more pairs of attribute names and key types: <ul>
     * <li><p><code>HASH</code> - partition key </li>
     * <li><p><code>RANGE</code> - sort key</li> </ul> <note> <p>The
     * partition key of an item is also known as its <i>hash attribute</i>.
     * The term "hash attribute" derives from DynamoDB' usage of an internal
     * hash function to evenly distribute data items across partitions, based
     * on their partition key values. <p>The sort key of an item is also
     * known as its <i>range attribute</i>. The term "range attribute"
     * derives from the way DynamoDB stores items with the same partition key
     * physically close together, in sorted order by the sort key
     * value.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param keySchema The complete key schema for the local secondary index, consisting of
     *         one or more pairs of attribute names and key types: <ul>
     *         <li><p><code>HASH</code> - partition key </li>
     *         <li><p><code>RANGE</code> - sort key</li> </ul> <note> <p>The
     *         partition key of an item is also known as its <i>hash attribute</i>.
     *         The term "hash attribute" derives from DynamoDB' usage of an internal
     *         hash function to evenly distribute data items across partitions, based
     *         on their partition key values. <p>The sort key of an item is also
     *         known as its <i>range attribute</i>. The term "range attribute"
     *         derives from the way DynamoDB stores items with the same partition key
     *         physically close together, in sorted order by the sort key
     *         value.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LocalSecondaryIndexDescription withKeySchema(KeySchemaElement... keySchema) {
        if (getKeySchema() == null) setKeySchema(new java.util.ArrayList<KeySchemaElement>(keySchema.length));
        for (KeySchemaElement value : keySchema) {
            getKeySchema().add(value);
        }
        return this;
    }
    
    /**
     * The complete key schema for the local secondary index, consisting of
     * one or more pairs of attribute names and key types: <ul>
     * <li><p><code>HASH</code> - partition key </li>
     * <li><p><code>RANGE</code> - sort key</li> </ul> <note> <p>The
     * partition key of an item is also known as its <i>hash attribute</i>.
     * The term "hash attribute" derives from DynamoDB' usage of an internal
     * hash function to evenly distribute data items across partitions, based
     * on their partition key values. <p>The sort key of an item is also
     * known as its <i>range attribute</i>. The term "range attribute"
     * derives from the way DynamoDB stores items with the same partition key
     * physically close together, in sorted order by the sort key
     * value.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param keySchema The complete key schema for the local secondary index, consisting of
     *         one or more pairs of attribute names and key types: <ul>
     *         <li><p><code>HASH</code> - partition key </li>
     *         <li><p><code>RANGE</code> - sort key</li> </ul> <note> <p>The
     *         partition key of an item is also known as its <i>hash attribute</i>.
     *         The term "hash attribute" derives from DynamoDB' usage of an internal
     *         hash function to evenly distribute data items across partitions, based
     *         on their partition key values. <p>The sort key of an item is also
     *         known as its <i>range attribute</i>. The term "range attribute"
     *         derives from the way DynamoDB stores items with the same partition key
     *         physically close together, in sorted order by the sort key
     *         value.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LocalSecondaryIndexDescription withKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        if (keySchema == null) {
            this.keySchema = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement> keySchemaCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement>(keySchema.size());
            keySchemaCopy.addAll(keySchema);
            this.keySchema = keySchemaCopy;
        }

        return this;
    }

    /**
     * Represents attributes that are copied (projected) from the table into
     * an index. These are in addition to the primary key attributes and
     * index key attributes, which are automatically projected.
     *
     * @return Represents attributes that are copied (projected) from the table into
     *         an index. These are in addition to the primary key attributes and
     *         index key attributes, which are automatically projected.
     */
    public Projection getProjection() {
        return projection;
    }
    
    /**
     * Represents attributes that are copied (projected) from the table into
     * an index. These are in addition to the primary key attributes and
     * index key attributes, which are automatically projected.
     *
     * @param projection Represents attributes that are copied (projected) from the table into
     *         an index. These are in addition to the primary key attributes and
     *         index key attributes, which are automatically projected.
     */
    public void setProjection(Projection projection) {
        this.projection = projection;
    }
    
    /**
     * Represents attributes that are copied (projected) from the table into
     * an index. These are in addition to the primary key attributes and
     * index key attributes, which are automatically projected.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param projection Represents attributes that are copied (projected) from the table into
     *         an index. These are in addition to the primary key attributes and
     *         index key attributes, which are automatically projected.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LocalSecondaryIndexDescription withProjection(Projection projection) {
        this.projection = projection;
        return this;
    }

    /**
     * The total size of the specified index, in bytes. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     *
     * @return The total size of the specified index, in bytes. DynamoDB updates this
     *         value approximately every six hours. Recent changes might not be
     *         reflected in this value.
     */
    public Long getIndexSizeBytes() {
        return indexSizeBytes;
    }
    
    /**
     * The total size of the specified index, in bytes. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     *
     * @param indexSizeBytes The total size of the specified index, in bytes. DynamoDB updates this
     *         value approximately every six hours. Recent changes might not be
     *         reflected in this value.
     */
    public void setIndexSizeBytes(Long indexSizeBytes) {
        this.indexSizeBytes = indexSizeBytes;
    }
    
    /**
     * The total size of the specified index, in bytes. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param indexSizeBytes The total size of the specified index, in bytes. DynamoDB updates this
     *         value approximately every six hours. Recent changes might not be
     *         reflected in this value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LocalSecondaryIndexDescription withIndexSizeBytes(Long indexSizeBytes) {
        this.indexSizeBytes = indexSizeBytes;
        return this;
    }

    /**
     * The number of items in the specified index. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     *
     * @return The number of items in the specified index. DynamoDB updates this
     *         value approximately every six hours. Recent changes might not be
     *         reflected in this value.
     */
    public Long getItemCount() {
        return itemCount;
    }
    
    /**
     * The number of items in the specified index. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     *
     * @param itemCount The number of items in the specified index. DynamoDB updates this
     *         value approximately every six hours. Recent changes might not be
     *         reflected in this value.
     */
    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }
    
    /**
     * The number of items in the specified index. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param itemCount The number of items in the specified index. DynamoDB updates this
     *         value approximately every six hours. Recent changes might not be
     *         reflected in this value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LocalSecondaryIndexDescription withItemCount(Long itemCount) {
        this.itemCount = itemCount;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) that uniquely identifies the index.
     *
     * @return The Amazon Resource Name (ARN) that uniquely identifies the index.
     */
    public String getIndexArn() {
        return indexArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) that uniquely identifies the index.
     *
     * @param indexArn The Amazon Resource Name (ARN) that uniquely identifies the index.
     */
    public void setIndexArn(String indexArn) {
        this.indexArn = indexArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) that uniquely identifies the index.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param indexArn The Amazon Resource Name (ARN) that uniquely identifies the index.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LocalSecondaryIndexDescription withIndexArn(String indexArn) {
        this.indexArn = indexArn;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIndexName() != null) sb.append("IndexName: " + getIndexName() + ",");
        if (getKeySchema() != null) sb.append("KeySchema: " + getKeySchema() + ",");
        if (getProjection() != null) sb.append("Projection: " + getProjection() + ",");
        if (getIndexSizeBytes() != null) sb.append("IndexSizeBytes: " + getIndexSizeBytes() + ",");
        if (getItemCount() != null) sb.append("ItemCount: " + getItemCount() + ",");
        if (getIndexArn() != null) sb.append("IndexArn: " + getIndexArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode()); 
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode()); 
        hashCode = prime * hashCode + ((getProjection() == null) ? 0 : getProjection().hashCode()); 
        hashCode = prime * hashCode + ((getIndexSizeBytes() == null) ? 0 : getIndexSizeBytes().hashCode()); 
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode()); 
        hashCode = prime * hashCode + ((getIndexArn() == null) ? 0 : getIndexArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LocalSecondaryIndexDescription == false) return false;
        LocalSecondaryIndexDescription other = (LocalSecondaryIndexDescription)obj;
        
        if (other.getIndexName() == null ^ this.getIndexName() == null) return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false) return false; 
        if (other.getKeySchema() == null ^ this.getKeySchema() == null) return false;
        if (other.getKeySchema() != null && other.getKeySchema().equals(this.getKeySchema()) == false) return false; 
        if (other.getProjection() == null ^ this.getProjection() == null) return false;
        if (other.getProjection() != null && other.getProjection().equals(this.getProjection()) == false) return false; 
        if (other.getIndexSizeBytes() == null ^ this.getIndexSizeBytes() == null) return false;
        if (other.getIndexSizeBytes() != null && other.getIndexSizeBytes().equals(this.getIndexSizeBytes()) == false) return false; 
        if (other.getItemCount() == null ^ this.getItemCount() == null) return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false) return false; 
        if (other.getIndexArn() == null ^ this.getIndexArn() == null) return false;
        if (other.getIndexArn() != null && other.getIndexArn().equals(this.getIndexArn()) == false) return false; 
        return true;
    }
    
}
    