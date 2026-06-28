.class public Lorg/osmdroid/util/IntegerAccepter;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mIndex:I

.field private final mValues:[I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-array p1, p1, [I

    .line 5
    .line 6
    iput-object p1, p0, Lorg/osmdroid/util/IntegerAccepter;->mValues:[I

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
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


# virtual methods
.method public add(I)V
    .locals 3

    iget-object v0, p0, Lorg/osmdroid/util/IntegerAccepter;->mValues:[I

    iget v1, p0, Lorg/osmdroid/util/IntegerAccepter;->mIndex:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/osmdroid/util/IntegerAccepter;->mIndex:I

    aput p1, v0, v1

    return-void
.end method

.method public end()V
    .locals 0

    return-void
.end method

.method public flush()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lorg/osmdroid/util/IntegerAccepter;->mIndex:I

    return-void
.end method

.method public getValue(I)I
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/util/IntegerAccepter;->mValues:[I

    aget p1, v0, p1

    return p1
.end method

.method public init()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lorg/osmdroid/util/IntegerAccepter;->mIndex:I

    return-void
.end method
