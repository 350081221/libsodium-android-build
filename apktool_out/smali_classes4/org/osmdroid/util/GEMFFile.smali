.class public Lorg/osmdroid/util/GEMFFile;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/util/GEMFFile$GEMFRange;,
        Lorg/osmdroid/util/GEMFFile$GEMFInputStream;
    }
.end annotation


# static fields
.field private static final FILE_COPY_BUFFER_SIZE:I = 0x400

.field private static final FILE_SIZE_LIMIT:J = 0x40000000L

.field private static final TILE_SIZE:I = 0x100

.field private static final U32_SIZE:I = 0x4

.field private static final U64_SIZE:I = 0x8

.field private static final VERSION:I = 0x4


# instance fields
.field private mCurrentSource:I

.field private final mFileNames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mFileSizes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final mFiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/io/RandomAccessFile;",
            ">;"
        }
    .end annotation
.end field

.field private final mLocation:Ljava/lang/String;

.field private final mRangeData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/osmdroid/util/GEMFFile$GEMFRange;",
            ">;"
        }
    .end annotation
.end field

.field private mSourceLimited:Z

.field private final mSources:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/osmdroid/util/GEMFFile;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/util/GEMFFile;->mFiles:Ljava/util/List;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/util/GEMFFile;->mFileNames:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/util/GEMFFile;->mRangeData:Ljava/util/List;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/util/GEMFFile;->mFileSizes:Ljava/util/List;

    .line 7
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/util/GEMFFile;->mSources:Ljava/util/LinkedHashMap;

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lorg/osmdroid/util/GEMFFile;->mSourceLimited:Z

    .line 9
    iput v0, p0, Lorg/osmdroid/util/GEMFFile;->mCurrentSource:I

    .line 10
    iput-object p1, p0, Lorg/osmdroid/util/GEMFFile;->mLocation:Ljava/lang/String;

    .line 11
    invoke-direct {p0}, Lorg/osmdroid/util/GEMFFile;->openFiles()V

    .line 12
    invoke-direct {p0}, Lorg/osmdroid/util/GEMFFile;->readHeader()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;,
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 13
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lorg/osmdroid/util/GEMFFile;->mFiles:Ljava/util/List;

    .line 15
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lorg/osmdroid/util/GEMFFile;->mFileNames:Ljava/util/List;

    .line 16
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lorg/osmdroid/util/GEMFFile;->mRangeData:Ljava/util/List;

    .line 17
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lorg/osmdroid/util/GEMFFile;->mFileSizes:Ljava/util/List;

    .line 18
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v2, v0, Lorg/osmdroid/util/GEMFFile;->mSources:Ljava/util/LinkedHashMap;

    const/4 v2, 0x0

    .line 19
    iput-boolean v2, v0, Lorg/osmdroid/util/GEMFFile;->mSourceLimited:Z

    .line 20
    iput v2, v0, Lorg/osmdroid/util/GEMFFile;->mCurrentSource:I

    .line 21
    iput-object v1, v0, Lorg/osmdroid/util/GEMFFile;->mLocation:Ljava/lang/String;

    .line 22
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 23
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/io/File;

    .line 24
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 25
    invoke-virtual {v5}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v7

    array-length v8, v7

    move v9, v2

    :goto_1
    if-ge v9, v8, :cond_2

    aget-object v10, v7, v9

    .line 26
    :try_start_0
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_4

    .line 27
    new-instance v11, Ljava/util/LinkedHashMap;

    invoke-direct {v11}, Ljava/util/LinkedHashMap;-><init>()V

    .line 28
    invoke-virtual {v10}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v12

    array-length v13, v12

    move v14, v2

    :goto_2
    if-ge v14, v13, :cond_1

    aget-object v15, v12, v14

    .line 29
    :try_start_1
    invoke-virtual {v15}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_3

    .line 30
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    move-object/from16 p2, v4

    .line 31
    invoke-virtual {v15}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    move-object/from16 v17, v7

    array-length v7, v4

    move/from16 v18, v8

    const/4 v8, 0x0

    :goto_3
    if-ge v8, v7, :cond_0

    move/from16 v19, v7

    aget-object v7, v4, v8

    move-object/from16 v20, v4

    .line 32
    :try_start_2
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    move-object/from16 v21, v12

    .line 33
    :try_start_3
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v12
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_1

    move/from16 v22, v13

    const/16 v13, 0x2e

    :try_start_4
    invoke-virtual {v12, v13}, Ljava/lang/String;->indexOf(I)I

    move-result v12

    const/4 v13, 0x0

    .line 34
    invoke-virtual {v4, v13, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_2

    .line 35
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    .line 36
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v12

    const/16 v1, 0x2e

    invoke-virtual {v12, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    .line 37
    invoke-virtual {v4, v13, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1, v7}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :catch_0
    move-object/from16 v21, v12

    :catch_1
    move/from16 v22, v13

    :catch_2
    :goto_4
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v1, p1

    move/from16 v7, v19

    move-object/from16 v4, v20

    move-object/from16 v12, v21

    move/from16 v13, v22

    goto :goto_3

    :cond_0
    move-object/from16 v21, v12

    move/from16 v22, v13

    .line 38
    new-instance v1, Ljava/lang/Integer;

    invoke-virtual {v15}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :catch_3
    move-object/from16 p2, v4

    move-object/from16 v17, v7

    move/from16 v18, v8

    move-object/from16 v21, v12

    move/from16 v22, v13

    :goto_5
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v1, p1

    move-object/from16 v4, p2

    move-object/from16 v7, v17

    move/from16 v8, v18

    move-object/from16 v12, v21

    move/from16 v13, v22

    const/4 v2, 0x0

    goto/16 :goto_2

    :cond_1
    move-object/from16 p2, v4

    move-object/from16 v17, v7

    move/from16 v18, v8

    .line 39
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v1, v11}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :catch_4
    move-object/from16 p2, v4

    move-object/from16 v17, v7

    move/from16 v18, v8

    :goto_6
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p1

    move-object/from16 v4, p2

    move-object/from16 v7, v17

    move/from16 v8, v18

    const/4 v2, 0x0

    goto/16 :goto_1

    :cond_2
    move-object/from16 p2, v4

    .line 40
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, p1

    const/4 v2, 0x0

    goto/16 :goto_0

    .line 41
    :cond_3
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 42
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 43
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v13, 0x0

    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 44
    new-instance v6, Ljava/lang/Integer;

    invoke-direct {v6, v13}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v1, v5, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    new-instance v6, Ljava/lang/Integer;

    invoke-direct {v6, v13}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v2, v6, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v13, v13, 0x1

    goto :goto_7

    .line 46
    :cond_4
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 47
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 48
    invoke-virtual {v3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/LinkedHashMap;

    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    .line 49
    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 50
    new-instance v10, Ljava/util/TreeSet;

    invoke-virtual {v3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/LinkedHashMap;

    invoke-virtual {v11, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/LinkedHashMap;

    invoke-virtual {v11}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v10}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_9
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_9

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    .line 51
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 52
    invoke-virtual {v3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/LinkedHashMap;

    invoke-virtual {v13, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/LinkedHashMap;

    invoke-virtual {v13, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/LinkedHashMap;

    invoke-virtual {v13}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_a
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_6

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    .line 53
    invoke-interface {v12, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 54
    :cond_6
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v13

    if-nez v13, :cond_7

    goto :goto_9

    .line 55
    :cond_7
    invoke-static {v12}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 56
    invoke-virtual {v9, v12}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_8

    .line 57
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v9, v12, v13}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    :cond_8
    invoke-virtual {v9, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 59
    :cond_9
    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 60
    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_e

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    .line 61
    new-instance v13, Ljava/util/TreeSet;

    invoke-virtual {v9, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/Collection;

    invoke-direct {v13, v14}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    .line 62
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 63
    invoke-virtual {v13}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Integer;

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v15

    :goto_c
    invoke-virtual {v13}, Ljava/util/TreeSet;->last()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/lang/Integer;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Integer;->intValue()I

    move-result v17

    move-object/from16 p2, v5

    add-int/lit8 v5, v17, 0x1

    if-ge v15, v5, :cond_c

    .line 64
    new-instance v5, Ljava/lang/Integer;

    invoke-direct {v5, v15}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v13, v5}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 65
    new-instance v5, Ljava/lang/Integer;

    invoke-direct {v5, v15}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v14, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .line 66
    :cond_a
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_b

    .line 67
    invoke-virtual {v10, v12, v14}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    move-object v14, v5

    :cond_b
    :goto_d
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v5, p2

    goto :goto_c

    .line 69
    :cond_c
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_d

    .line 70
    invoke-virtual {v10, v12, v14}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    move-object/from16 v5, p2

    goto :goto_b

    :cond_e
    move-object/from16 p2, v5

    .line 71
    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_f
    :goto_e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_14

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    .line 72
    new-instance v11, Ljava/util/TreeSet;

    invoke-direct {v11, v10}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    .line 73
    new-instance v12, Ljava/util/TreeSet;

    invoke-virtual {v9, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Collection;

    invoke-direct {v12, v10}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    .line 74
    new-instance v10, Lorg/osmdroid/util/GEMFFile$GEMFRange;

    const/4 v13, 0x0

    invoke-direct {v10, v0, v13}, Lorg/osmdroid/util/GEMFFile$GEMFRange;-><init>(Lorg/osmdroid/util/GEMFFile;Lorg/osmdroid/util/GEMFFile$1;)V

    .line 75
    iput-object v8, v10, Lorg/osmdroid/util/GEMFFile$GEMFRange;->zoom:Ljava/lang/Integer;

    .line 76
    invoke-virtual {v1, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    iput-object v14, v10, Lorg/osmdroid/util/GEMFFile$GEMFRange;->sourceIndex:Ljava/lang/Integer;

    .line 77
    invoke-virtual {v12}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    iput-object v14, v10, Lorg/osmdroid/util/GEMFFile$GEMFRange;->xMin:Ljava/lang/Integer;

    .line 78
    invoke-virtual {v12}, Ljava/util/TreeSet;->last()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    iput-object v14, v10, Lorg/osmdroid/util/GEMFFile$GEMFRange;->xMax:Ljava/lang/Integer;

    .line 79
    invoke-virtual {v11}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    :goto_f
    invoke-virtual {v11}, Ljava/util/TreeSet;->last()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Integer;

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v15

    add-int/lit8 v15, v15, 0x1

    if-ge v14, v15, :cond_13

    .line 80
    new-instance v15, Ljava/lang/Integer;

    invoke-direct {v15, v14}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v11, v15}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_11

    .line 81
    iget-object v15, v10, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMin:Ljava/lang/Integer;

    if-nez v15, :cond_10

    .line 82
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    iput-object v15, v10, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMin:Ljava/lang/Integer;

    .line 83
    :cond_10
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    iput-object v15, v10, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMax:Ljava/lang/Integer;

    goto :goto_10

    .line 84
    :cond_11
    iget-object v15, v10, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMin:Ljava/lang/Integer;

    if-eqz v15, :cond_12

    .line 85
    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    new-instance v10, Lorg/osmdroid/util/GEMFFile$GEMFRange;

    invoke-direct {v10, v0, v13}, Lorg/osmdroid/util/GEMFFile$GEMFRange;-><init>(Lorg/osmdroid/util/GEMFFile;Lorg/osmdroid/util/GEMFFile$1;)V

    .line 87
    iput-object v8, v10, Lorg/osmdroid/util/GEMFFile$GEMFRange;->zoom:Ljava/lang/Integer;

    .line 88
    invoke-virtual {v1, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Integer;

    iput-object v15, v10, Lorg/osmdroid/util/GEMFFile$GEMFRange;->sourceIndex:Ljava/lang/Integer;

    .line 89
    invoke-virtual {v12}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Integer;

    iput-object v15, v10, Lorg/osmdroid/util/GEMFFile$GEMFRange;->xMin:Ljava/lang/Integer;

    .line 90
    invoke-virtual {v12}, Ljava/util/TreeSet;->last()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Integer;

    iput-object v15, v10, Lorg/osmdroid/util/GEMFFile$GEMFRange;->xMax:Ljava/lang/Integer;

    :cond_12
    :goto_10
    add-int/lit8 v14, v14, 0x1

    goto :goto_f

    .line 91
    :cond_13
    iget-object v11, v10, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMin:Ljava/lang/Integer;

    if-eqz v11, :cond_f

    .line 92
    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_e

    :cond_14
    move-object/from16 v5, p2

    goto/16 :goto_8

    .line 93
    :cond_15
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v13, 0x0

    :goto_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 94
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, 0x8

    add-int/2addr v13, v6

    goto :goto_11

    :cond_16
    add-int/lit8 v13, v13, 0xc

    .line 95
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    mul-int/lit8 v5, v5, 0x20

    add-int/2addr v13, v5

    const/4 v5, 0x4

    add-int/2addr v13, v5

    int-to-long v6, v13

    .line 96
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_17
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_19

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lorg/osmdroid/util/GEMFFile$GEMFRange;

    .line 97
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    iput-object v10, v9, Lorg/osmdroid/util/GEMFFile$GEMFRange;->offset:Ljava/lang/Long;

    .line 98
    iget-object v10, v9, Lorg/osmdroid/util/GEMFFile$GEMFRange;->xMin:Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    :goto_12
    iget-object v11, v9, Lorg/osmdroid/util/GEMFFile$GEMFRange;->xMax:Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    add-int/lit8 v11, v11, 0x1

    if-ge v10, v11, :cond_17

    .line 99
    iget-object v11, v9, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMin:Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    :goto_13
    iget-object v12, v9, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMax:Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    add-int/lit8 v12, v12, 0x1

    if-ge v11, v12, :cond_18

    const-wide/16 v12, 0xc

    add-long/2addr v6, v12

    add-int/lit8 v11, v11, 0x1

    goto :goto_13

    :cond_18
    add-int/lit8 v10, v10, 0x1

    goto :goto_12

    .line 100
    :cond_19
    new-instance v8, Ljava/io/RandomAccessFile;

    const-string v9, "rw"

    move-object/from16 v10, p1

    invoke-direct {v8, v10, v9}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    invoke-virtual {v8, v5}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/16 v5, 0x100

    .line 102
    invoke-virtual {v8, v5}, Ljava/io/RandomAccessFile;->writeInt(I)V

    .line 103
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    move-result v5

    invoke-virtual {v8, v5}, Ljava/io/RandomAccessFile;->writeInt(I)V

    .line 104
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 105
    invoke-virtual {v1, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-virtual {v8, v12}, Ljava/io/RandomAccessFile;->writeInt(I)V

    .line 106
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v12

    invoke-virtual {v8, v12}, Ljava/io/RandomAccessFile;->writeInt(I)V

    .line 107
    invoke-virtual {v11}, Ljava/lang/String;->getBytes()[B

    move-result-object v11

    invoke-virtual {v8, v11}, Ljava/io/RandomAccessFile;->write([B)V

    goto :goto_14

    .line 108
    :cond_1a
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v8, v1}, Ljava/io/RandomAccessFile;->writeInt(I)V

    .line 109
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;

    .line 110
    iget-object v11, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->zoom:Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-virtual {v8, v11}, Ljava/io/RandomAccessFile;->writeInt(I)V

    .line 111
    iget-object v11, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->xMin:Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-virtual {v8, v11}, Ljava/io/RandomAccessFile;->writeInt(I)V

    .line 112
    iget-object v11, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->xMax:Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-virtual {v8, v11}, Ljava/io/RandomAccessFile;->writeInt(I)V

    .line 113
    iget-object v11, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMin:Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-virtual {v8, v11}, Ljava/io/RandomAccessFile;->writeInt(I)V

    .line 114
    iget-object v11, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMax:Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-virtual {v8, v11}, Ljava/io/RandomAccessFile;->writeInt(I)V

    .line 115
    iget-object v11, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->sourceIndex:Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-virtual {v8, v11}, Ljava/io/RandomAccessFile;->writeInt(I)V

    .line 116
    iget-object v5, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->offset:Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-virtual {v8, v11, v12}, Ljava/io/RandomAccessFile;->writeLong(J)V

    goto :goto_15

    .line 117
    :cond_1b
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-wide v11, v6

    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;

    .line 118
    iget-object v13, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->xMin:Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    :goto_17
    iget-object v14, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->xMax:Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    add-int/lit8 v14, v14, 0x1

    if-ge v13, v14, :cond_1d

    .line 119
    iget-object v14, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMin:Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    :goto_18
    iget-object v15, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMax:Ljava/lang/Integer;

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v15

    add-int/lit8 v15, v15, 0x1

    if-ge v14, v15, :cond_1c

    .line 120
    invoke-virtual {v8, v11, v12}, Ljava/io/RandomAccessFile;->writeLong(J)V

    .line 121
    iget-object v15, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->sourceIndex:Ljava/lang/Integer;

    .line 122
    invoke-virtual {v2, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    .line 123
    invoke-virtual {v3, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/util/LinkedHashMap;

    iget-object v0, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->zoom:Ljava/lang/Integer;

    .line 124
    invoke-virtual {v15, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v0, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v0, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    move-object/from16 p2, v1

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    long-to-int v15, v0

    .line 125
    invoke-virtual {v8, v15}, Ljava/io/RandomAccessFile;->writeInt(I)V

    add-long/2addr v11, v0

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    goto :goto_18

    :cond_1c
    move-object/from16 p2, v1

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, p0

    goto :goto_17

    :cond_1d
    move-object/from16 v0, p0

    goto :goto_16

    :cond_1e
    const/16 v0, 0x400

    new-array v1, v0, [B

    .line 126
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v13, 0x0

    :goto_19
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_23

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;

    .line 127
    iget-object v11, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->xMin:Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    :goto_1a
    iget-object v12, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->xMax:Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    add-int/lit8 v12, v12, 0x1

    if-ge v11, v12, :cond_22

    .line 128
    iget-object v12, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMin:Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    :goto_1b
    iget-object v14, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMax:Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    add-int/lit8 v14, v14, 0x1

    if-ge v12, v14, :cond_21

    .line 129
    iget-object v14, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->sourceIndex:Ljava/lang/Integer;

    .line 130
    invoke-virtual {v2, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    .line 131
    invoke-virtual {v3, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/LinkedHashMap;

    iget-object v15, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->zoom:Ljava/lang/Integer;

    .line 132
    invoke-virtual {v14, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/LinkedHashMap;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/LinkedHashMap;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/io/File;

    invoke-virtual {v14}, Ljava/io/File;->length()J

    move-result-wide v14

    add-long/2addr v6, v14

    const-wide/32 v14, 0x40000000

    cmp-long v14, v6, v14

    if-lez v14, :cond_1f

    .line 133
    invoke-virtual {v8}, Ljava/io/RandomAccessFile;->close()V

    add-int/lit8 v13, v13, 0x1

    .line 134
    new-instance v6, Ljava/io/RandomAccessFile;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "-"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7, v9}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v7, 0x0

    move-wide/from16 v23, v7

    move-object v8, v6

    move-wide/from16 v6, v23

    .line 135
    :cond_1f
    new-instance v14, Ljava/io/FileInputStream;

    iget-object v15, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->sourceIndex:Ljava/lang/Integer;

    .line 136
    invoke-virtual {v2, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    .line 137
    invoke-virtual {v3, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/util/LinkedHashMap;

    iget-object v0, v5, Lorg/osmdroid/util/GEMFFile$GEMFRange;->zoom:Ljava/lang/Integer;

    .line 138
    invoke-virtual {v15, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v0, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v0, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-direct {v14, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const/16 v0, 0x400

    const/4 v15, 0x0

    .line 139
    invoke-virtual {v14, v1, v15, v0}, Ljava/io/FileInputStream;->read([BII)I

    move-result v16

    move/from16 v0, v16

    move-object/from16 v16, v2

    :goto_1c
    const/4 v2, -0x1

    if-eq v0, v2, :cond_20

    .line 140
    invoke-virtual {v8, v1, v15, v0}, Ljava/io/RandomAccessFile;->write([BII)V

    const/16 v0, 0x400

    .line 141
    invoke-virtual {v14, v1, v15, v0}, Ljava/io/FileInputStream;->read([BII)I

    move-result v2

    move v0, v2

    goto :goto_1c

    :cond_20
    const/16 v0, 0x400

    .line 142
    invoke-virtual {v14}, Ljava/io/FileInputStream;->close()V

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v2, v16

    goto/16 :goto_1b

    :cond_21
    move-object/from16 v16, v2

    const/4 v15, 0x0

    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_1a

    :cond_22
    const/4 v15, 0x0

    goto/16 :goto_19

    .line 143
    :cond_23
    invoke-virtual {v8}, Ljava/io/RandomAccessFile;->close()V

    .line 144
    invoke-direct/range {p0 .. p0}, Lorg/osmdroid/util/GEMFFile;->openFiles()V

    .line 145
    invoke-direct/range {p0 .. p0}, Lorg/osmdroid/util/GEMFFile;->readHeader()V

    return-void
.end method

.method private openFiles()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/osmdroid/util/GEMFFile;->mLocation:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lorg/osmdroid/util/GEMFFile;->mFiles:Ljava/util/List;

    .line 9
    .line 10
    new-instance v2, Ljava/io/RandomAccessFile;

    .line 11
    .line 12
    const-string v3, "r"

    .line 13
    .line 14
    invoke-direct {v2, v0, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lorg/osmdroid/util/GEMFFile;->mFileNames:Ljava/util/List;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    :goto_0
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    new-instance v1, Ljava/io/File;

    .line 33
    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object v4, p0, Lorg/osmdroid/util/GEMFFile;->mLocation:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v4, "-"

    .line 45
    .line 46
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_0

    .line 64
    .line 65
    iget-object v2, p0, Lorg/osmdroid/util/GEMFFile;->mFiles:Ljava/util/List;

    .line 66
    .line 67
    new-instance v4, Ljava/io/RandomAccessFile;

    .line 68
    .line 69
    invoke-direct {v4, v1, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    iget-object v2, p0, Lorg/osmdroid/util/GEMFFile;->mFileNames:Ljava/util/List;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    return-void
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
.end method

.method private readHeader()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/osmdroid/util/GEMFFile;->mFiles:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/io/RandomAccessFile;

    .line 9
    .line 10
    iget-object v2, p0, Lorg/osmdroid/util/GEMFFile;->mFiles:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Ljava/io/RandomAccessFile;

    .line 27
    .line 28
    iget-object v4, p0, Lorg/osmdroid/util/GEMFFile;->mFileSizes:Ljava/util/List;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->length()J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const/4 v3, 0x4

    .line 47
    if-ne v2, v3, :cond_4

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    const/16 v3, 0x100

    .line 54
    .line 55
    if-ne v2, v3, :cond_3

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    move v3, v1

    .line 62
    :goto_1
    if-ge v3, v2, :cond_1

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    new-array v6, v5, [B

    .line 73
    .line 74
    invoke-virtual {v0, v6, v1, v5}, Ljava/io/RandomAccessFile;->read([BII)I

    .line 75
    .line 76
    .line 77
    new-instance v5, Ljava/lang/String;

    .line 78
    .line 79
    invoke-direct {v5, v6}, Ljava/lang/String;-><init>([B)V

    .line 80
    .line 81
    .line 82
    iget-object v6, p0, Lorg/osmdroid/util/GEMFFile;->mSources:Ljava/util/LinkedHashMap;

    .line 83
    .line 84
    new-instance v7, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-direct {v7, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, v7, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    add-int/lit8 v3, v3, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    :goto_2
    if-ge v1, v2, :cond_2

    .line 100
    .line 101
    new-instance v3, Lorg/osmdroid/util/GEMFFile$GEMFRange;

    .line 102
    .line 103
    const/4 v4, 0x0

    .line 104
    invoke-direct {v3, p0, v4}, Lorg/osmdroid/util/GEMFFile$GEMFRange;-><init>(Lorg/osmdroid/util/GEMFFile;Lorg/osmdroid/util/GEMFFile$1;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    iput-object v4, v3, Lorg/osmdroid/util/GEMFFile$GEMFRange;->zoom:Ljava/lang/Integer;

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    iput-object v4, v3, Lorg/osmdroid/util/GEMFFile$GEMFRange;->xMin:Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    iput-object v4, v3, Lorg/osmdroid/util/GEMFFile$GEMFRange;->xMax:Ljava/lang/Integer;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    iput-object v4, v3, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMin:Ljava/lang/Integer;

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    iput-object v4, v3, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMax:Ljava/lang/Integer;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    iput-object v4, v3, Lorg/osmdroid/util/GEMFFile$GEMFRange;->sourceIndex:Ljava/lang/Integer;

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readLong()J

    .line 168
    .line 169
    .line 170
    move-result-wide v4

    .line 171
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    iput-object v4, v3, Lorg/osmdroid/util/GEMFFile$GEMFRange;->offset:Ljava/lang/Long;

    .line 176
    .line 177
    iget-object v4, p0, Lorg/osmdroid/util/GEMFFile;->mRangeData:Ljava/util/List;

    .line 178
    .line 179
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    add-int/lit8 v1, v1, 0x1

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_2
    return-void

    .line 186
    :cond_3
    new-instance v0, Ljava/io/IOException;

    .line 187
    .line 188
    new-instance v1, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 191
    .line 192
    .line 193
    const-string v3, "Bad tile size: "

    .line 194
    .line 195
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v0

    .line 209
    :cond_4
    new-instance v0, Ljava/io/IOException;

    .line 210
    .line 211
    new-instance v1, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 214
    .line 215
    .line 216
    const-string v3, "Bad file version: "

    .line 217
    .line 218
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw v0
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
.end method


# virtual methods
.method public acceptAnySource()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/osmdroid/util/GEMFFile;->mSourceLimited:Z

    return-void
.end method

.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/osmdroid/util/GEMFFile;->mFiles:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/io/RandomAccessFile;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public getInputStream(III)Ljava/io/InputStream;
    .locals 10

    .line 1
    iget-object v0, p0, Lorg/osmdroid/util/GEMFFile;->mRangeData:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lorg/osmdroid/util/GEMFFile$GEMFRange;

    .line 19
    .line 20
    iget-object v3, v1, Lorg/osmdroid/util/GEMFFile$GEMFRange;->zoom:Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-ne p3, v3, :cond_0

    .line 27
    .line 28
    iget-object v3, v1, Lorg/osmdroid/util/GEMFFile$GEMFRange;->xMin:Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-lt p1, v3, :cond_0

    .line 35
    .line 36
    iget-object v3, v1, Lorg/osmdroid/util/GEMFFile$GEMFRange;->xMax:Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-gt p1, v3, :cond_0

    .line 43
    .line 44
    iget-object v3, v1, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMin:Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-lt p2, v3, :cond_0

    .line 51
    .line 52
    iget-object v3, v1, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMax:Ljava/lang/Integer;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-gt p2, v3, :cond_0

    .line 59
    .line 60
    iget-boolean v3, p0, Lorg/osmdroid/util/GEMFFile;->mSourceLimited:Z

    .line 61
    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    iget-object v3, v1, Lorg/osmdroid/util/GEMFFile$GEMFRange;->sourceIndex:Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    iget v4, p0, Lorg/osmdroid/util/GEMFFile;->mCurrentSource:I

    .line 71
    .line 72
    if-ne v3, v4, :cond_0

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    move-object v1, v2

    .line 76
    :cond_2
    :goto_0
    if-nez v1, :cond_3

    .line 77
    .line 78
    return-object v2

    .line 79
    :cond_3
    :try_start_0
    iget-object p3, v1, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMax:Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    add-int/lit8 p3, p3, 0x1

    .line 86
    .line 87
    iget-object v0, v1, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMin:Ljava/lang/Integer;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    sub-int/2addr p3, v0

    .line 94
    iget-object v0, v1, Lorg/osmdroid/util/GEMFFile$GEMFRange;->xMin:Ljava/lang/Integer;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    sub-int/2addr p1, v0

    .line 101
    iget-object v0, v1, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMin:Ljava/lang/Integer;

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    sub-int/2addr p2, v0

    .line 108
    mul-int/2addr p1, p3

    .line 109
    add-int/2addr p1, p2

    .line 110
    int-to-long p1, p1

    .line 111
    const-wide/16 v3, 0xc

    .line 112
    .line 113
    mul-long/2addr p1, v3

    .line 114
    iget-object p3, v1, Lorg/osmdroid/util/GEMFFile$GEMFRange;->offset:Ljava/lang/Long;

    .line 115
    .line 116
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 117
    .line 118
    .line 119
    move-result-wide v0

    .line 120
    add-long/2addr p1, v0

    .line 121
    iget-object p3, p0, Lorg/osmdroid/util/GEMFFile;->mFiles:Ljava/util/List;

    .line 122
    .line 123
    const/4 v0, 0x0

    .line 124
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p3

    .line 128
    check-cast p3, Ljava/io/RandomAccessFile;

    .line 129
    .line 130
    invoke-virtual {p3, p1, p2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p3}, Ljava/io/RandomAccessFile;->readLong()J

    .line 134
    .line 135
    .line 136
    move-result-wide p1

    .line 137
    invoke-virtual {p3}, Ljava/io/RandomAccessFile;->readInt()I

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    iget-object p3, p0, Lorg/osmdroid/util/GEMFFile;->mFiles:Ljava/util/List;

    .line 142
    .line 143
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    check-cast p3, Ljava/io/RandomAccessFile;

    .line 148
    .line 149
    iget-object v1, p0, Lorg/osmdroid/util/GEMFFile;->mFileSizes:Ljava/util/List;

    .line 150
    .line 151
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    check-cast v1, Ljava/lang/Long;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 158
    .line 159
    .line 160
    move-result-wide v3

    .line 161
    cmp-long v1, p1, v3

    .line 162
    .line 163
    if-lez v1, :cond_5

    .line 164
    .line 165
    iget-object p3, p0, Lorg/osmdroid/util/GEMFFile;->mFileSizes:Ljava/util/List;

    .line 166
    .line 167
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 168
    .line 169
    .line 170
    move-result p3

    .line 171
    move v1, v0

    .line 172
    :goto_1
    add-int/lit8 v3, p3, -0x1

    .line 173
    .line 174
    if-ge v1, v3, :cond_4

    .line 175
    .line 176
    iget-object v3, p0, Lorg/osmdroid/util/GEMFFile;->mFileSizes:Ljava/util/List;

    .line 177
    .line 178
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, Ljava/lang/Long;

    .line 183
    .line 184
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 185
    .line 186
    .line 187
    move-result-wide v3

    .line 188
    cmp-long v3, p1, v3

    .line 189
    .line 190
    if-lez v3, :cond_4

    .line 191
    .line 192
    iget-object v3, p0, Lorg/osmdroid/util/GEMFFile;->mFileSizes:Ljava/util/List;

    .line 193
    .line 194
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    check-cast v3, Ljava/lang/Long;

    .line 199
    .line 200
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 201
    .line 202
    .line 203
    move-result-wide v3

    .line 204
    sub-long/2addr p1, v3

    .line 205
    add-int/lit8 v1, v1, 0x1

    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_4
    iget-object p3, p0, Lorg/osmdroid/util/GEMFFile;->mFiles:Ljava/util/List;

    .line 209
    .line 210
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p3

    .line 214
    check-cast p3, Ljava/io/RandomAccessFile;

    .line 215
    .line 216
    move-wide v6, p1

    .line 217
    goto :goto_2

    .line 218
    :cond_5
    move-wide v6, p1

    .line 219
    move v1, v0

    .line 220
    :goto_2
    invoke-virtual {p3, v6, v7}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 221
    .line 222
    .line 223
    new-instance p1, Lorg/osmdroid/util/GEMFFile$GEMFInputStream;

    .line 224
    .line 225
    iget-object p2, p0, Lorg/osmdroid/util/GEMFFile;->mFileNames:Ljava/util/List;

    .line 226
    .line 227
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p2

    .line 231
    move-object v5, p2

    .line 232
    check-cast v5, Ljava/lang/String;

    .line 233
    .line 234
    move-object v3, p1

    .line 235
    move-object v4, p0

    .line 236
    invoke-direct/range {v3 .. v8}, Lorg/osmdroid/util/GEMFFile$GEMFInputStream;-><init>(Lorg/osmdroid/util/GEMFFile;Ljava/lang/String;JI)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 237
    .line 238
    .line 239
    :try_start_1
    new-instance p2, Ljava/io/ByteArrayOutputStream;

    .line 240
    .line 241
    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 242
    .line 243
    .line 244
    const/16 p3, 0x400

    .line 245
    .line 246
    :try_start_2
    new-array p3, p3, [B

    .line 247
    .line 248
    :cond_6
    :goto_3
    invoke-virtual {p1}, Lorg/osmdroid/util/GEMFFile$GEMFInputStream;->available()I

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    if-lez v1, :cond_7

    .line 253
    .line 254
    invoke-virtual {p1, p3}, Ljava/io/InputStream;->read([B)I

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    if-lez v1, :cond_6

    .line 259
    .line 260
    invoke-virtual {p2, p3, v0, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 261
    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_7
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 265
    .line 266
    .line 267
    move-result-object p3

    .line 268
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 269
    .line 270
    invoke-direct {v0, p3}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 271
    .line 272
    .line 273
    :try_start_3
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 274
    .line 275
    .line 276
    goto :goto_4

    .line 277
    :catch_0
    move-exception p2

    .line 278
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 279
    .line 280
    .line 281
    :goto_4
    :try_start_4
    invoke-virtual {p1}, Lorg/osmdroid/util/GEMFFile$GEMFInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 282
    .line 283
    .line 284
    goto :goto_5

    .line 285
    :catch_1
    move-exception p1

    .line 286
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 287
    .line 288
    .line 289
    :goto_5
    move-object v2, v0

    .line 290
    goto :goto_8

    .line 291
    :catchall_0
    move-exception p3

    .line 292
    move-object v2, p2

    .line 293
    move-object p2, p1

    .line 294
    move-object p1, p3

    .line 295
    goto :goto_9

    .line 296
    :catch_2
    move-exception p3

    .line 297
    move-object v9, p2

    .line 298
    move-object p2, p1

    .line 299
    move-object p1, p3

    .line 300
    move-object p3, v9

    .line 301
    goto :goto_6

    .line 302
    :catchall_1
    move-exception p2

    .line 303
    move-object v9, p2

    .line 304
    move-object p2, p1

    .line 305
    move-object p1, v9

    .line 306
    goto :goto_9

    .line 307
    :catch_3
    move-exception p2

    .line 308
    move-object p3, v2

    .line 309
    move-object v9, p2

    .line 310
    move-object p2, p1

    .line 311
    move-object p1, v9

    .line 312
    goto :goto_6

    .line 313
    :catchall_2
    move-exception p1

    .line 314
    move-object p2, v2

    .line 315
    goto :goto_9

    .line 316
    :catch_4
    move-exception p1

    .line 317
    move-object p2, v2

    .line 318
    move-object p3, p2

    .line 319
    :goto_6
    :try_start_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 320
    .line 321
    .line 322
    if-eqz p3, :cond_8

    .line 323
    .line 324
    :try_start_6
    invoke-virtual {p3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 325
    .line 326
    .line 327
    goto :goto_7

    .line 328
    :catch_5
    move-exception p1

    .line 329
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 330
    .line 331
    .line 332
    :cond_8
    :goto_7
    if-eqz p2, :cond_9

    .line 333
    .line 334
    :try_start_7
    invoke-virtual {p2}, Lorg/osmdroid/util/GEMFFile$GEMFInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 335
    .line 336
    .line 337
    goto :goto_8

    .line 338
    :catch_6
    move-exception p1

    .line 339
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 340
    .line 341
    .line 342
    :cond_9
    :goto_8
    return-object v2

    .line 343
    :catchall_3
    move-exception p1

    .line 344
    move-object v2, p3

    .line 345
    :goto_9
    if-eqz v2, :cond_a

    .line 346
    .line 347
    :try_start_8
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    .line 348
    .line 349
    .line 350
    goto :goto_a

    .line 351
    :catch_7
    move-exception p3

    .line 352
    invoke-virtual {p3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 353
    .line 354
    .line 355
    :cond_a
    :goto_a
    if-eqz p2, :cond_b

    .line 356
    .line 357
    :try_start_9
    invoke-virtual {p2}, Lorg/osmdroid/util/GEMFFile$GEMFInputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    .line 358
    .line 359
    .line 360
    goto :goto_b

    .line 361
    :catch_8
    move-exception p2

    .line 362
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 363
    .line 364
    .line 365
    :cond_b
    :goto_b
    throw p1
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/util/GEMFFile;->mLocation:Ljava/lang/String;

    return-object v0
.end method

.method public getSources()Ljava/util/LinkedHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/util/GEMFFile;->mSources:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method public getZoomLevels()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/TreeSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lorg/osmdroid/util/GEMFFile;->mRangeData:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lorg/osmdroid/util/GEMFFile$GEMFRange;

    .line 23
    .line 24
    iget-object v2, v2, Lorg/osmdroid/util/GEMFFile$GEMFRange;->zoom:Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-object v0
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public selectSource(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/util/GEMFFile;->mSources:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lorg/osmdroid/util/GEMFFile;->mSourceLimited:Z

    .line 16
    .line 17
    iput p1, p0, Lorg/osmdroid/util/GEMFFile;->mCurrentSource:I

    .line 18
    .line 19
    :cond_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method
