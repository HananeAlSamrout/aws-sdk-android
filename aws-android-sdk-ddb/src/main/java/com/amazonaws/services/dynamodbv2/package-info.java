
/**
 * Synchronous and asynchronous client classes for accessing AmazonDynamoDBv2.
 *
 * Amazon DynamoDB <p>
 * This is the Amazon DynamoDB API Reference. This guide provides
 * descriptions of the low-level DynamoDB API.
 * </p>
 * <p>
 * This guide is intended for use with the following DynamoDB
 * documentation:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * 
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/gettingstartedguide/"> Amazon DynamoDB Getting Started Guide </a>
 * - provides hands-on exercises that help you learn the basics of
 * working with DynamoDB. <i>If you are new to DynamoDB, we recommend
 * that you begin with the Getting Started Guide.</i>
 * </p>
 * </li>
 * <li> <p>
 * 
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/"> Amazon DynamoDB Developer Guide </a>
 * - contains detailed information about DynamoDB concepts, usage, and
 * best practices.
 * </p>
 * </li>
 * <li> <p>
 * 
 * <a href="http://docs.aws.amazon.com/dynamodbstreams/latest/APIReference/"> Amazon DynamoDB Streams API Reference </a> - provides descriptions and samples of the DynamoDB Streams API. (For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Streams.html"> Capturing Table Activity with DynamoDB Streams </a>
 * in the Amazon DynamoDB Developer Guide.)
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * Instead of making the requests to the low-level DynamoDB API directly
 * from your application, we recommend that you use the AWS Software
 * Development Kits (SDKs). The easy-to-use libraries in the AWS SDKs
 * make it unnecessary to call the low-level DynamoDB API directly from
 * your application. The libraries take care of request authentication,
 * serialization, and connection management. For more information, see
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/UsingAWSSDK.html"> Using the AWS SDKs with DynamoDB </a>
 * in the Amazon DynamoDB Developer Guide.
 * </p>
 * <p>
 * If you decide to code against the low-level DynamoDB API directly, you
 * will need to write the necessary code to authenticate your requests.
 * For more information on signing your requests, see
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/API.html"> Using the DynamoDB API </a>
 * in the <i>Amazon DynamoDB Developer Guide</i> .
 * </p>
 * <p>
 * The following are short descriptions of each low-level API action,
 * organized by function.
 * </p>
 * <p>
 * <b>Managing Tables</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * <i>CreateTable</i> - Creates a table with user-specified provisioned
 * throughput settings. You must define a primary key for the table -
 * either a simple primary key (partition key), or a composite primary
 * key (partition key and sort key). Optionally, you can create one or
 * more secondary indexes, which provide fast data access using non-key
 * attributes.
 * </p>
 * </li>
 * <li> <p>
 * <i>DescribeTable</i> - Returns metadata for a table, such as table
 * size, status, and index information.
 * </p>
 * </li>
 * <li> <p>
 * <i>UpdateTable</i> - Modifies the provisioned throughput settings for
 * a table. Optionally, you can modify the provisioned throughput
 * settings for global secondary indexes on the table.
 * </p>
 * </li>
 * <li> <p>
 * <i>ListTables</i> - Returns a list of all tables associated with the
 * current AWS account and endpoint.
 * </p>
 * </li>
 * <li> <p>
 * <i>DeleteTable</i> - Deletes a table and all of its indexes.
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * For conceptual information about managing tables, see
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html"> Working with Tables </a>
 * in the <i>Amazon DynamoDB Developer Guide</i> .
 * </p>
 * <p>
 * <b>Reading Data</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * <i>GetItem</i> - Returns a set of attributes for the item that has a
 * given primary key. By default, <i>GetItem</i> performs an eventually
 * consistent read; however, applications can request a strongly
 * consistent read instead.
 * </p>
 * </li>
 * <li> <p>
 * <i>BatchGetItem</i> - Performs multiple <i>GetItem</i> requests for
 * data items using their primary keys, from one table or multiple
 * tables. The response from <i>BatchGetItem</i> has a size limit of 16
 * MB and returns a maximum of 100 items. Both eventually consistent and
 * strongly consistent reads can be used.
 * </p>
 * </li>
 * <li> <p>
 * <i>Query</i> - Returns one or more items from a table or a secondary
 * index. You must provide a specific value for the partition key. You
 * can narrow the scope of the query using comparison operators against a
 * sort key value, or on the index key. <i>Query</i> supports either
 * eventual or strong consistency. A single response has a size limit of
 * 1 MB.
 * </p>
 * </li>
 * <li> <p>
 * <i>Scan</i> - Reads every item in a table; the result set is
 * eventually consistent. You can limit the number of items returned by
 * filtering the data attributes, using conditional expressions.
 * <i>Scan</i> can be used to enable ad-hoc querying of a table against
 * non-key attributes; however, since this is a full table scan without
 * using an index, <i>Scan</i> should not be used for any application
 * query use case that requires predictable performance.
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * For conceptual information about reading data, see
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"> Working with Items </a> and <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"> Query and Scan Operations </a>
 * in the <i>Amazon DynamoDB Developer Guide</i> .
 * </p>
 * <p>
 * <b>Modifying Data</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * <i>PutItem</i> - Creates a new item, or replaces an existing item
 * with a new item (including all the attributes). By default, if an item
 * in the table already exists with the same primary key, the new item
 * completely replaces the existing item. You can use conditional
 * operators to replace an item only if its attribute values match
 * certain conditions, or to insert a new item only if that item doesn't
 * already exist.
 * </p>
 * </li>
 * <li> <p>
 * <i>UpdateItem</i> - Modifies the attributes of an existing item. You
 * can also use conditional operators to perform an update only if the
 * item's attribute values match certain conditions.
 * </p>
 * </li>
 * <li> <p>
 * <i>DeleteItem</i> - Deletes an item in a table by primary key. You
 * can use conditional operators to perform a delete an item only if the
 * item's attribute values match certain conditions.
 * </p>
 * </li>
 * <li> <p>
 * <i>BatchWriteItem</i> - Performs multiple <i>PutItem</i> and
 * <i>DeleteItem</i> requests across multiple tables in a single request.
 * A failure of any request(s) in the batch will not cause the entire
 * <i>BatchWriteItem</i> operation to fail. Supports batches of up to 25
 * items to put or delete, with a maximum total request size of 16 MB.
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * For conceptual information about modifying data, see
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"> Working with Items </a> and <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"> Query and Scan Operations </a>
 * in the <i>Amazon DynamoDB Developer Guide</i> .
 * </p>
 */
 package com.amazonaws.services.dynamodbv2;
        