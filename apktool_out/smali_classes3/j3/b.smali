.class public Lj3/b;
.super Ljava/lang/Number;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;
.implements Lj3/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Number;",
        "Ljava/lang/Comparable<",
        "Lj3/b;",
        ">;",
        "Lj3/a<",
        "Ljava/lang/Number;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x77401786b8L


# instance fields
.field private value:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Number;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Number;-><init>()V

    .line 3
    iput p1, p0, Lj3/b;->value:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/Number;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Number;-><init>()V

    .line 5
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, p0, Lj3/b;->value:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    .line 6
    invoke-direct {p0}, Ljava/lang/Number;-><init>()V

    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lj3/b;->value:I

    return-void
.end method


# virtual methods
.method public add(I)V
    .locals 1

    .line 1
    iget v0, p0, Lj3/b;->value:I

    add-int/2addr v0, p1

    iput v0, p0, Lj3/b;->value:I

    return-void
.end method

.method public add(Ljava/lang/Number;)V
    .locals 1

    .line 2
    iget v0, p0, Lj3/b;->value:I

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    add-int/2addr v0, p1

    iput v0, p0, Lj3/b;->value:I

    return-void
.end method

.method public compareTo(Lj3/b;)I
    .locals 1

    .line 2
    iget p1, p1, Lj3/b;->value:I

    .line 3
    iget v0, p0, Lj3/b;->value:I

    if-ge v0, p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    if-ne v0, p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    :goto_0
    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lj3/b;

    invoke-virtual {p0, p1}, Lj3/b;->compareTo(Lj3/b;)I

    move-result p1

    return p1
.end method

.method public decrement()V
    .locals 1

    iget v0, p0, Lj3/b;->value:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lj3/b;->value:I

    return-void
.end method

.method public doubleValue()D
    .locals 2

    iget v0, p0, Lj3/b;->value:I

    int-to-double v0, v0

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lj3/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lj3/b;->value:I

    .line 7
    .line 8
    check-cast p1, Lj3/b;

    .line 9
    .line 10
    invoke-virtual {p1}, Lj3/b;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-ne v0, p1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    :cond_0
    return v1
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
.end method

.method public floatValue()F
    .locals 1

    iget v0, p0, Lj3/b;->value:I

    int-to-float v0, v0

    return v0
.end method

.method public getValue()Ljava/lang/Integer;
    .locals 1

    .line 2
    iget v0, p0, Lj3/b;->value:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/b;->getValue()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lj3/b;->value:I

    return v0
.end method

.method public increment()V
    .locals 1

    iget v0, p0, Lj3/b;->value:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lj3/b;->value:I

    return-void
.end method

.method public intValue()I
    .locals 1

    iget v0, p0, Lj3/b;->value:I

    return v0
.end method

.method public longValue()J
    .locals 2

    iget v0, p0, Lj3/b;->value:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public setValue(I)V
    .locals 0

    .line 2
    iput p1, p0, Lj3/b;->value:I

    return-void
.end method

.method public setValue(Ljava/lang/Number;)V
    .locals 0

    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, p0, Lj3/b;->value:I

    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p0, p1}, Lj3/b;->setValue(Ljava/lang/Number;)V

    return-void
.end method

.method public subtract(I)V
    .locals 1

    .line 1
    iget v0, p0, Lj3/b;->value:I

    sub-int/2addr v0, p1

    iput v0, p0, Lj3/b;->value:I

    return-void
.end method

.method public subtract(Ljava/lang/Number;)V
    .locals 1

    .line 2
    iget v0, p0, Lj3/b;->value:I

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sub-int/2addr v0, p1

    iput v0, p0, Lj3/b;->value:I

    return-void
.end method

.method public toInteger()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lj3/b;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lj3/b;->value:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
