.class public Lcom/lody/virtual/server/pm/parser/VPackage$Component;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/pm/parser/VPackage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Component"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<II:",
        "Lcom/lody/virtual/server/pm/parser/VPackage$IntentInfo;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public className:Ljava/lang/String;

.field private componentName:Landroid/content/ComponentName;

.field public intents:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "TII;>;"
        }
    .end annotation
.end field

.field public metaData:Landroid/os/Bundle;

.field public owner:Lcom/lody/virtual/server/pm/parser/VPackage;


# direct methods
.method protected constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/pm/PackageParser$Component;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iget-object v0, p1, Landroid/content/pm/PackageParser$Component;->className:Ljava/lang/String;

    iput-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->className:Ljava/lang/String;

    .line 4
    iget-object p1, p1, Landroid/content/pm/PackageParser$Component;->metaData:Landroid/os/Bundle;

    iput-object p1, p0, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->metaData:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public getComponentName()Landroid/content/ComponentName;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->componentName:Landroid/content/ComponentName;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->className:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    new-instance v0, Landroid/content/ComponentName;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->owner:Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 13
    .line 14
    iget-object v1, v1, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v2, p0, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->className:Ljava/lang/String;

    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->componentName:Landroid/content/ComponentName;

    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->componentName:Landroid/content/ComponentName;

    .line 24
    .line 25
    return-object v0
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
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
.end method
