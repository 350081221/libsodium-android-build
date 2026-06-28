.class public Lorg/osmdroid/views/overlay/advancedpolyline/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/views/overlay/advancedpolyline/b;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final b:[I

.field private c:I


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lorg/osmdroid/views/overlay/advancedpolyline/c;->a:Ljava/util/List;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lorg/osmdroid/views/overlay/advancedpolyline/c;->b:[I

    return-void
.end method

.method public constructor <init>([I)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lorg/osmdroid/views/overlay/advancedpolyline/c;->a:Ljava/util/List;

    .line 6
    iput-object p1, p0, Lorg/osmdroid/views/overlay/advancedpolyline/c;->b:[I

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 2

    .line 1
    iget v0, p0, Lorg/osmdroid/views/overlay/advancedpolyline/c;->c:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    if-lt p1, v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/overlay/advancedpolyline/c;->b:[I

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    array-length v1, v0

    .line 13
    rem-int/2addr p1, v1

    .line 14
    aget p1, v0, p1

    .line 15
    .line 16
    return p1

    .line 17
    :cond_1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/advancedpolyline/c;->a:Ljava/util/List;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    rem-int/2addr p1, v1

    .line 26
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1

    .line 37
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 40
    .line 41
    .line 42
    throw p1
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

.method public b(I)V
    .locals 0

    iput p1, p0, Lorg/osmdroid/views/overlay/advancedpolyline/c;->c:I

    return-void
.end method
