.class Lorg/osmdroid/util/GEMFFile$GEMFRange;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/osmdroid/util/GEMFFile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "GEMFRange"
.end annotation


# instance fields
.field offset:Ljava/lang/Long;

.field sourceIndex:Ljava/lang/Integer;

.field final synthetic this$0:Lorg/osmdroid/util/GEMFFile;

.field xMax:Ljava/lang/Integer;

.field xMin:Ljava/lang/Integer;

.field yMax:Ljava/lang/Integer;

.field yMin:Ljava/lang/Integer;

.field zoom:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Lorg/osmdroid/util/GEMFFile;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/osmdroid/util/GEMFFile$GEMFRange;->this$0:Lorg/osmdroid/util/GEMFFile;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/osmdroid/util/GEMFFile;Lorg/osmdroid/util/GEMFFile$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lorg/osmdroid/util/GEMFFile$GEMFRange;-><init>(Lorg/osmdroid/util/GEMFFile;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, Lorg/osmdroid/util/GEMFFile$GEMFRange;->sourceIndex:Ljava/lang/Integer;

    .line 6
    .line 7
    aput-object v2, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iget-object v2, p0, Lorg/osmdroid/util/GEMFFile$GEMFRange;->zoom:Ljava/lang/Integer;

    .line 11
    .line 12
    aput-object v2, v0, v1

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    iget-object v2, p0, Lorg/osmdroid/util/GEMFFile$GEMFRange;->xMin:Ljava/lang/Integer;

    .line 16
    .line 17
    aput-object v2, v0, v1

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    iget-object v2, p0, Lorg/osmdroid/util/GEMFFile$GEMFRange;->xMax:Ljava/lang/Integer;

    .line 21
    .line 22
    aput-object v2, v0, v1

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    iget-object v2, p0, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMin:Ljava/lang/Integer;

    .line 26
    .line 27
    aput-object v2, v0, v1

    .line 28
    .line 29
    const/4 v1, 0x5

    .line 30
    iget-object v2, p0, Lorg/osmdroid/util/GEMFFile$GEMFRange;->yMax:Ljava/lang/Integer;

    .line 31
    .line 32
    aput-object v2, v0, v1

    .line 33
    .line 34
    const/4 v1, 0x6

    .line 35
    iget-object v2, p0, Lorg/osmdroid/util/GEMFFile$GEMFRange;->offset:Ljava/lang/Long;

    .line 36
    .line 37
    aput-object v2, v0, v1

    .line 38
    .line 39
    const-string v1, "GEMF Range: source=%d, zoom=%d, x=%d-%d, y=%d-%d, offset=0x%08X"

    .line 40
    .line 41
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method
